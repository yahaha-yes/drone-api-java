package com.gitlab.yahaha.service;

import com.gitlab.yahaha.domain.crone.Crone;
import com.gitlab.yahaha.domain.crone.CroneCreate;
import com.gitlab.yahaha.domain.crone.CroneTrigger;
import okhttp3.OkHttpClient;

import java.util.List;

public abstract class DroneCron extends AbstractDroneBaseApi {
    public DroneCron(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public abstract DroneCron withOwner(String owner);

    public abstract DroneCron withRepo(String repo);

    public abstract DroneCron withCrone(String crone);

    public abstract boolean delete();

    public abstract Crone create(CroneCreate croneCreate);

    public abstract Crone info();

    public abstract List<Crone> list();

    public abstract CroneTrigger trigger();

    public abstract Crone update(CroneCreate croneCreate);
}
