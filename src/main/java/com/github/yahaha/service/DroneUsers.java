package com.github.yahaha.service;

import com.github.yahaha.domain.user.User;
import com.github.yahaha.domain.user.UserCreate;
import com.github.yahaha.domain.user.UserUpdate;
import okhttp3.OkHttpClient;

import java.util.List;

public abstract class DroneUsers extends AbstractDroneBaseApi{

    protected String login;

    public DroneUsers(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public abstract User create(UserCreate userCreate);

    public abstract boolean delete();

    public abstract User info();

    public abstract List<User> list();

    public abstract User update(UserUpdate userUpdate);

    public abstract DroneUsers withLogin(String login);
}
