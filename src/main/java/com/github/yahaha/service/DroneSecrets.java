package com.github.yahaha.service;

import com.github.yahaha.domain.secret.Secret;
import com.github.yahaha.domain.secret.SecretCreate;
import com.github.yahaha.domain.secret.SecretUpdate;
import okhttp3.OkHttpClient;

import java.util.List;

public abstract class DroneSecrets extends AbstractDroneBaseApi {

    protected String owner;

    protected String repo;

    protected String secret;

    public DroneSecrets(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public abstract DroneSecrets withOwner(String owner);

    public abstract DroneSecrets withRepo(String repo);

    public abstract DroneSecrets withSecret(String secret);

    public abstract Secret create(SecretCreate create);

    public abstract boolean delete();

    public abstract Secret info();

    public abstract List<Secret> list();

    public abstract Secret update(SecretUpdate secretUpdate);

}
