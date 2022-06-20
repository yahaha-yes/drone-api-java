package com.github.yahaha.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.yahaha.domain.repo.Repo;
import com.github.yahaha.domain.repo.RepoUpdate;
import com.github.yahaha.service.DroneRepos;
import com.github.yahaha.common.Utils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import static com.github.yahaha.common.DroneAPIsUtils.REPO_API_URL;
import static com.github.yahaha.common.DroneAPIsUtils.REPO_LIST_API_URL;

public class DefaultDroneReposImpl extends DroneRepos {

    private static Logger logger = Logger.getLogger(DefaultDroneReposImpl.class.toString());

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
            logger.info(exception.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public boolean chown() {
        String requestUrl = url + REPO_API_URL +"/"+ owner + "/" + repo + "/chown";
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(RequestBody.create("", Utils.getJsonMediaType()))
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return false;
        }
    }

    @Override
    public boolean enable() {
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(RequestBody.create("", Utils.getJsonMediaType()))
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return false;
        }
    }

    @Override
    public boolean disable() {
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .delete()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return false;
        }
    }

    @Override
    public Repo info() {
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Repo.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public Repo update(RepoUpdate repoUpdate) {
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo;
        RequestBody body = RequestBody.create(JSON.toJSONString(repoUpdate), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .patch(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Repo.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean repair() {
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/repair";
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(RequestBody.create("", Utils.getJsonMediaType()))
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return false;
        }
    }
}
