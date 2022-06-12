package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.domain.repo.Repo;
import com.gitlab.yahaha.domain.user.User;
import com.gitlab.yahaha.service.DroneUser;
import okhttp3.OkHttpClient;

import java.util.List;

public class DefaultDroneUserImpl extends DroneUser {
    public DefaultDroneUserImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    @Override
    public User info() {
        return null;
    }

    @Override
    public Object feed() {
        return null;
    }

    @Override
    public List<Repo> userRepos() {
        return null;
    }

    @Override
    public void sync() {

    }
}
