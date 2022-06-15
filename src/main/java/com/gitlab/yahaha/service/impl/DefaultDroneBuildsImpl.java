package com.gitlab.yahaha.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.gitlab.yahaha.domain.build.Build;
import com.gitlab.yahaha.domain.build.Logs;
import com.gitlab.yahaha.service.DroneBuilds;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import static com.gitlab.yahaha.common.DroneAPIsUtils.REPO_API_URL;

public class DefaultDroneBuildsImpl extends DroneBuilds {

    private static Logger logger = Logger.getLogger(DefaultDroneBuildsImpl.class.toString());

    public DefaultDroneBuildsImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    @Override
    public DroneBuilds withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public DroneBuilds withRepo(String repo) {
        this.repo = repo;
        return this;
    }

    @Override
    public DroneBuilds withBuild(String build) {
        this.build = build;
        return this;
    }

    @Override
    public DroneBuilds withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    @Override
    public DroneBuilds withCommit(String commit) {
        this.commit = commit;
        return this;
    }

    @Override
    public DroneBuilds withEnv(HashMap<String, String> env) {
        this.env = env;
        return this;
    }

    @Override
    public boolean approve() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return false;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return false;
        }
        if (this.build == null) {
            logger.info("build is null or empty!");
            return false;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/builds/" + build+"/approve";
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(null)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return false;
        }
    }

    @Override
    public Build create() {
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/builds/" + build + getUrl();
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(null)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Build.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean decline() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return false;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return false;
        }
        if (this.build == null) {
            logger.info("build is null or empty!");
            return false;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/builds/" + build+"/decline";
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(null)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() == 200;
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return false;
        }
    }

    @Override
    public Build info() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        if (this.build == null) {
            logger.info("build is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/builds/" + build;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Build.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public List<Build> list() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/builds/" + build;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), new TypeReference<ArrayList<Build>>() {
            });
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public List<Logs> logs(long stage, long step) {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        if (this.build == null) {
            logger.info("build is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/builds/" + build+"/logs/"+stage+"/"+step;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), new TypeReference<ArrayList<Logs>>() {
            });
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public Build restart() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return null;
        }
        if (this.build == null) {
            logger.info("build is null or empty!");
            return null;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/builds/" + build;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(null)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Build.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean stop() {
        if (this.owner == null) {
            logger.info("owner is null or empty!");
            return false;
        }
        if (this.repo == null) {
            logger.info("repo is null or empty!");
            return false;
        }
        if (this.build == null) {
            logger.info("build is null or empty!");
            return false;
        }
        String requestUrl = url + REPO_API_URL + "/" + owner + "/" + repo + "/builds/" + build;
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

    private String getUrl(){
        String url = "/builds";
        if (this.branch!=null){
            url+="?branch=" + branch;
        }
        if (this.commit!=null){
            url+="&commit="+commit;
        }
        return url;
    }
}
