package com.gitlab.yahaha.service;

import okhttp3.OkHttpClient;

public abstract class DroneUser extends AbstractDroneBaseApi {
    public DroneUser(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }
}
