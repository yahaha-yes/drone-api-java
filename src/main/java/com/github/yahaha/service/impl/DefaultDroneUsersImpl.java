package com.github.yahaha.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.yahaha.domain.user.User;
import com.github.yahaha.domain.user.UserCreate;
import com.github.yahaha.domain.user.UserUpdate;
import com.github.yahaha.service.DroneUsers;
import com.github.yahaha.common.Utils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import static com.github.yahaha.common.DroneAPIsUtils.USERS_API_URL;

public class DefaultDroneUsersImpl extends DroneUsers {

    private static Logger logger = Logger.getLogger(DefaultDroneUsersImpl.class.toString());

    public DefaultDroneUsersImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    @Override
    public User create(UserCreate userCreate) {
        String requestUrl = url + USERS_API_URL;
        RequestBody body = RequestBody.create(JSON.toJSONString(userCreate), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), User.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean delete() {
        if (this.login==null){
            logger.info("login is null or empty!");
            return false;
        }
        String requestUrl = url + USERS_API_URL + "/" + this.login;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .delete()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() < 300;
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return false;
        }
    }

    @Override
    public User info() {
        if (this.login==null){
            logger.info("login is null or empty!");
            return null;
        }
        String requestUrl = url + USERS_API_URL + "/" + login;
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
    public List<User> list() {
        String requestUrl = url + USERS_API_URL;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), new TypeReference<ArrayList<User>>() {
            });
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public User update(UserUpdate userUpdate) {
        if (this.login==null){
            logger.info("login is null or empty!");
            return null;
        }
        String requestUrl = url + USERS_API_URL + "/" + login;
        RequestBody body = RequestBody.create(JSON.toJSONString(userUpdate), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .patch(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), User.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public DroneUsers withLogin(String login) {
        this.login = login;
        return this;
    }
}
