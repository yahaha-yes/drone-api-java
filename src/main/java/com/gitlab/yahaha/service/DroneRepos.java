package com.gitlab.yahaha.service;

import com.gitlab.yahaha.domain.repo.Repo;
import com.gitlab.yahaha.domain.repo.RepoUpdate;
import okhttp3.OkHttpClient;

import java.util.List;

public abstract class DroneRepos extends AbstractDroneBaseApi {


    protected String owner;

    protected String repo;

    public DroneRepos withOwner(String owner){
        this.owner = owner;
        return this;
    }

    public DroneRepos withRepo(String repo){
        this.repo = repo;
        return this;
    }

    public DroneRepos(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    public abstract List<Repo> listRepos();

    public abstract boolean chown();

    public abstract boolean enable();

    public abstract boolean disable();

    public abstract Repo info();

    public abstract Repo update(RepoUpdate repoUpdate);

    public abstract boolean repair();
}
