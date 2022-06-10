package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.service.DroneUser;
import okhttp3.OkHttpClient;

public class DefaultDroneUserImpl extends DroneUser {
    public DefaultDroneUserImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }
}
