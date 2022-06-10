package com.gitlab.yahaha.service;

import okhttp3.OkHttpClient;

public abstract class DroneUsers extends AbstractDroneBaseApi{
    public DroneUsers(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }
}
