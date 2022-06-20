package com.github.yahaha.service;

import okhttp3.OkHttpClient;

public abstract class AbstractDroneBaseApi implements DroneBaseApi {

    protected OkHttpClient okHttpClient;

    protected String token;

    protected String url;

    public AbstractDroneBaseApi(OkHttpClient okHttpClient){
        this.okHttpClient = okHttpClient;
    }

    protected static final String HEADER = "Authorization";

    @Override
    public void withToken(String token) {
        this.token = token;
    }

    @Override
    public void withUrl(String url) {
        this.url = url;
    }
}
