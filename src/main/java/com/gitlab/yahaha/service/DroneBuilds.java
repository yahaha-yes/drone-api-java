package com.gitlab.yahaha.service;

import okhttp3.OkHttpClient;

public abstract class DroneBuilds extends AbstractDroneBaseApi  {
    public DroneBuilds(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }
}
