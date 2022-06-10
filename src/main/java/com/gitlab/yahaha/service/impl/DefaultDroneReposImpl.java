package com.gitlab.yahaha.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.gitlab.yahaha.common.Utils;
import com.gitlab.yahaha.domain.repo.Repo;
import com.gitlab.yahaha.domain.repo.RepoUpdate;
import com.gitlab.yahaha.service.DroneRepos;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefaultDroneReposImpl extends DroneRepos {

    private static final String BASE_API_URL = "/api/repos/";

    private static final String REPO_LIST_API_URL = "/api/user/repos";

    public DefaultDroneReposImpl(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    @Override
    public List<Repo> listRepos() {
        String requestUrl = url + REPO_LIST_API_URL;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), new TypeReference<ArrayList<Repo>>() {
            });
        } catch (Exception exception) {
            return Collections.emptyList();
        }
    }

    @Override
    public boolean chown() {
        String requestUrl = url + BASE_API_URL + owner + "/" + repo + "/chown";
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(null)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public boolean enable() {
        String requestUrl = url + BASE_API_URL + "/" + owner + "/" + repo;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(null)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public boolean disable() {
        String requestUrl = url + BASE_API_URL + "/" + owner + "/" + repo;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .delete()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public Repo info() {
        String requestUrl = url + BASE_API_URL + "/" + owner + "/" + repo;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Repo.class);
        } catch (Exception exception) {
            return null;
        }
    }

    @Override
    public Repo update(RepoUpdate repoUpdate) {
        String requestUrl = url + BASE_API_URL + "/" + owner + "/" + repo;
        RequestBody body = RequestBody.create(JSON.toJSONString(repoUpdate), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .patch(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Repo.class);
        } catch (Exception exception) {
            return null;
        }
    }

    @Override
    public boolean repair() {
        String requestUrl = url + BASE_API_URL + "/" + owner + "/" + repo + "/repair";
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(null)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            return false;
        }
    }
}