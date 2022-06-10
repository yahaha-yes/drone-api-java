package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.service.DroneCron;
import okhttp3.OkHttpClient;

public class DefaultDroneCronImpl extends DroneCron {
    public DefaultDroneCronImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }
}
