package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.service.DroneTemplates;
import okhttp3.OkHttpClient;

public class DefaultDroneTemplatesImpl extends DroneTemplates {

    public DefaultDroneTemplatesImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }
}
