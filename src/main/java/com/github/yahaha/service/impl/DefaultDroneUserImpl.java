package com.github.yahaha.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.yahaha.domain.repo.Repo;
import com.github.yahaha.domain.user.User;
import com.github.yahaha.service.DroneUser;
import com.github.yahaha.common.Utils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import static com.github.yahaha.common.DroneAPIsUtils.*;

public class DefaultDroneUserImpl extends DroneUser {

    private static Logger logger = Logger.getLogger(DefaultDroneUserImpl.class.toString());

    public DefaultDroneUserImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    @Override
    public User info() {
        String requestUrl = url + USER_API_URL;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), User.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public List<Repo> feed() {
        String requestUrl = url + USER_API_URL +"/builds";
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
            return null;
        }
    }

    @Override
    public List<Repo> userRepos() {
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
    public boolean sync() {
        String requestUrl = url + REPO_LIST_API_URL;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(RequestBody.create("", Utils.getJsonMediaType()))
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() < 300;
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return false;
        }
    }
}
