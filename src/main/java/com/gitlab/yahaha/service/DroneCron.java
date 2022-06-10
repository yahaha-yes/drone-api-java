package com.gitlab.yahaha.service;

import okhttp3.OkHttpClient;

public abstract class DroneCron extends AbstractDroneBaseApi {
    public DroneCron(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }
}
