package com.gitlab.yahaha.service;

import okhttp3.OkHttpClient;

public abstract class DroneTemplates extends AbstractDroneBaseApi{
    public DroneTemplates(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }
}
