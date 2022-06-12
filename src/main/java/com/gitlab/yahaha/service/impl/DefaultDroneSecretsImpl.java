package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.domain.secret.Secret;
import com.gitlab.yahaha.domain.secret.SecretCreate;
import com.gitlab.yahaha.domain.secret.SecretUpdate;
import com.gitlab.yahaha.service.DroneSecrets;
import okhttp3.OkHttpClient;

import java.util.List;

public class DefaultDroneSecretsImpl extends DroneSecrets {
    public DefaultDroneSecretsImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    @Override
    public DroneSecrets withOwner() {
        return null;
    }

    @Override
    public DroneSecrets withRepo() {
        return null;
    }

    @Override
    public DroneSecrets withSecret() {
        return null;
    }

    @Override
    public Secret create(SecretCreate create) {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public Secret info() {
        return null;
    }

    @Override
    public List<Secret> list() {
        return null;
    }

    @Override
    public Secret update(SecretUpdate secretUpdate) {
        return null;
    }
}
