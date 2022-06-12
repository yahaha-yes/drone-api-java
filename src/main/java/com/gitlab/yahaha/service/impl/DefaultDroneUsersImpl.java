package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.domain.user.User;
import com.gitlab.yahaha.domain.user.UserCreate;
import com.gitlab.yahaha.domain.user.UserUpdate;
import com.gitlab.yahaha.service.DroneUsers;
import okhttp3.OkHttpClient;

import java.util.List;

public class DefaultDroneUsersImpl extends DroneUsers {

    public DefaultDroneUsersImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    @Override
    public User create(UserCreate userCreate) {
        return null;
    }

    @Override
    public boolean delete(String login) {
        if (this.login==null){
            return false;
        }
        return false;
    }

    @Override
    public User info() {
        return null;
    }

    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public User update(UserUpdate userUpdate) {
        return null;
    }

    @Override
    public DroneUsers withLogin(String login) {
        return null;
    }
}
