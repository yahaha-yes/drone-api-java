package com.github.yahaha.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.yahaha.domain.cron.Cron;
import com.github.yahaha.domain.cron.CronCreate;
import com.github.yahaha.domain.cron.CronTrigger;
import com.github.yahaha.service.DroneCron;
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

public class DefaultDroneCronImpl extends DroneCron {

    private static Logger logger = Logger.getLogger(DefaultDroneCronImpl.class.toString());

    public DefaultDroneCronImpl(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    @Override
    public DroneCron withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public DroneCron withRepo(String repo) {
        this.repo = repo;
        return this;
    }

    @Override
    public DroneCron withCrone(String crone) {
        this.cron = crone;
        return this;
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
        if (this.cron == null) {
            logger.info("crone is null or empty!");
            return false;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/cron/" + cron;
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
    public Cron create(CronCreate cronCreate) {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/cron";
        RequestBody body = RequestBody.create(JSON.toJSONString(cronCreate), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Cron.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public Cron info() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        if (this.cron == null) {
            logger.info("crone is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/cron/" + cron;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Cron.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public List<Cron> list() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/cron";
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), new TypeReference<ArrayList<Cron>>() {
            });
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public CronTrigger trigger() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        if (this.cron == null) {
            logger.info("crone is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/cron/" + cron;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(RequestBody.create("", Utils.getJsonMediaType()))
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), CronTrigger.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public Cron update(CronCreate cronCreate) {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        if (this.cron == null) {
            logger.info("crone is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/cron/" + cron;
        RequestBody body = RequestBody.create(JSON.toJSONString(cronCreate), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .patch(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Cron.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }
}
