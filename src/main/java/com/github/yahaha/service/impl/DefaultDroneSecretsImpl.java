package com.github.yahaha.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.yahaha.domain.secret.Secret;
import com.github.yahaha.domain.secret.SecretCreate;
import com.github.yahaha.domain.secret.SecretUpdate;
import com.github.yahaha.service.DroneSecrets;
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

public class DefaultDroneSecretsImpl extends DroneSecrets {

    private static Logger logger = Logger.getLogger(DefaultDroneSecretsImpl.class.toString());

    public DefaultDroneSecretsImpl(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    @Override
    public DroneSecrets withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public DroneSecrets withRepo(String repo) {
        this.repo = repo;
        return this;
    }

    @Override
    public DroneSecrets withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    @Override
    public Secret create(SecretCreate create) {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/secrets";
        RequestBody body = RequestBody.create(JSON.toJSONString(create), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Secret.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean delete() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return false;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return false;
        }
        if (this.secret == null) {
            logger.info("secret is null or empty!");
            return false;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/secrets/" + secret;
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
    public Secret info() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        if (this.secret == null) {
            logger.info("secret is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/secrets/" + secret;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Secret.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public List<Secret> list() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return Collections.emptyList();
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return Collections.emptyList();
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/secrets";
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), new TypeReference<ArrayList<Secret>>() {
            });
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public Secret update(SecretUpdate secretUpdate) {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        if (this.secret == null) {
            logger.info("secret is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/secrets/" + secret;
        RequestBody body = RequestBody.create(JSON.toJSONString(secretUpdate), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .patch(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Secret.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }
}
