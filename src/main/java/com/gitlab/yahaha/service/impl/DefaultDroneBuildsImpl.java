package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.domain.build.Build;
import com.gitlab.yahaha.service.DroneBuilds;
import okhttp3.OkHttpClient;

import java.util.List;

public class DefaultDroneBuildsImpl extends DroneBuilds {

    public DefaultDroneBuildsImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    @Override
    public DroneBuilds withOwner(String owner) {
        return null;
    }

    @Override
    public DroneBuilds withRepo(String repo) {
        return null;
    }

    @Override
    public DroneBuilds withBuild(String build) {
        return null;
    }

    @Override
    public boolean approve() {
        return false;
    }

    @Override
    public Build create() {
        return null;
    }

    @Override
    public Build createWithBranch(String branch) {
        return null;
    }

    @Override
    public Build createWithBranchAndCommit(String branch, String commit) {
        return null;
    }

    @Override
    public boolean decline() {
        return false;
    }

    @Override
    public Build info() {
        return null;
    }

    @Override
    public List<Build> list() {
        return null;
    }

    @Override
    public Build restart() {
        return null;
    }

    @Override
    public boolean stop() {
        return false;
    }
}
