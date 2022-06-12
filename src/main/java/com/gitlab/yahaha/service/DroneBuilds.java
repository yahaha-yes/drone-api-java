package com.gitlab.yahaha.service;

import com.gitlab.yahaha.domain.build.Build;
import okhttp3.OkHttpClient;

import java.util.List;

public abstract class DroneBuilds extends AbstractDroneBaseApi  {

    protected String owner;

    protected String repo;

    protected String build;

    public DroneBuilds(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public abstract DroneBuilds withOwner(String owner);

    public abstract DroneBuilds withRepo(String repo);

    public abstract DroneBuilds withBuild(String build);

    public abstract boolean approve();

    public abstract Build create();

    public abstract Build createWithBranch(String branch);

    public abstract Build createWithBranchAndCommit(String branch,String commit);

    public abstract boolean decline();

    public abstract Build info();

    public abstract List<Build> list();

    public abstract Build restart();

    public abstract boolean stop();

}
