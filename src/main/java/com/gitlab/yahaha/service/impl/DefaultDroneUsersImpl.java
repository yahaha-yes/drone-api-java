package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.service.DroneUsers;
import okhttp3.OkHttpClient;

public class DefaultDroneUsersImpl extends DroneUsers {

    public DefaultDroneUsersImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }
}
