package com.github.yahaha.service;

import com.github.yahaha.domain.build.Build;
import com.github.yahaha.domain.build.Logs;
import okhttp3.OkHttpClient;

import java.util.HashMap;
import java.util.List;

public abstract class DroneBuilds extends AbstractDroneBaseApi  {

    protected String owner;

    protected String repo;

    protected String build;

    protected String branch = "master";

    protected String commit;

    protected HashMap<String,String> env;

    public DroneBuilds(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public abstract DroneBuilds withOwner(String owner);

    public abstract DroneBuilds withRepo(String repo);

    public abstract DroneBuilds withBuild(String build);

    public abstract DroneBuilds withBranch(String branch);

    public abstract DroneBuilds withCommit(String commit);

    public abstract DroneBuilds withEnv(HashMap<String,String> env);

    public abstract boolean approve();

    public abstract Build create();

    public abstract boolean decline();

    public abstract Build info();

    public abstract List<Build> list();

    public abstract List<Logs> logs(long stage, long step);

    public abstract Build restart();

    public abstract boolean stop();

}
