package com.gitlab.yahaha.service;

import okhttp3.OkHttpClient;

public abstract class DroneSecrets extends AbstractDroneBaseApi {
    public DroneSecrets(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }
}
