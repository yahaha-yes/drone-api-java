package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.service.DroneSecrets;
import okhttp3.OkHttpClient;

public class DefaultDroneSecretsImpl extends DroneSecrets {
    public DefaultDroneSecretsImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }
}
