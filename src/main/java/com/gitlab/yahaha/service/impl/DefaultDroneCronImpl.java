package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.domain.crone.Crone;
import com.gitlab.yahaha.domain.crone.CroneCreate;
import com.gitlab.yahaha.domain.crone.CroneTrigger;
import com.gitlab.yahaha.service.DroneCron;
import okhttp3.OkHttpClient;

import java.util.List;

public class DefaultDroneCronImpl extends DroneCron {
    public DefaultDroneCronImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    @Override
    public DroneCron withOwner(String owner) {
        return null;
    }

    @Override
    public DroneCron withRepo(String repo) {
        return null;
    }

    @Override
    public DroneCron withCrone(String crone) {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public Crone create(CroneCreate croneCreate) {
        return null;
    }

    @Override
    public Crone info() {
        return null;
    }

    @Override
    public List<Crone> list() {
        return null;
    }

    @Override
    public CroneTrigger trigger() {
        return null;
    }

    @Override
    public Crone update(CroneCreate croneCreate) {
        return null;
    }
}
