package com.gitlab.yahaha.service;

import com.gitlab.yahaha.domain.secret.Secret;
import com.gitlab.yahaha.domain.secret.SecretCreate;
import com.gitlab.yahaha.domain.secret.SecretUpdate;
import okhttp3.OkHttpClient;

import java.util.List;

public abstract class DroneSecrets extends AbstractDroneBaseApi {

    public DroneSecrets(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public abstract DroneSecrets withOwner();

    public abstract DroneSecrets withRepo();

    public abstract DroneSecrets withSecret();

    public abstract Secret create(SecretCreate create);

    public abstract boolean delete();

    public abstract Secret info();

    public abstract List<Secret> list();

    public abstract Secret update(SecretUpdate secretUpdate);

}
