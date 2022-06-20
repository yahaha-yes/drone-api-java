package com.github.yahaha.service;

import com.github.yahaha.domain.repo.Repo;
import com.github.yahaha.domain.user.User;
import okhttp3.OkHttpClient;

import java.util.List;

public abstract class DroneUser extends AbstractDroneBaseApi {
    public DroneUser(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public abstract User info();

    public abstract List<Repo> feed();

    public abstract List<Repo> userRepos();

    public abstract boolean sync();
}
