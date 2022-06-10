package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.service.DroneBuilds;
import okhttp3.OkHttpClient;

public class DefaultDroneBuildsImpl extends DroneBuilds {

    public DefaultDroneBuildsImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }
}
