package com.gitlab.yahaha.service;

import com.gitlab.yahaha.domain.cron.Cron;
import com.gitlab.yahaha.domain.cron.CronCreate;
import com.gitlab.yahaha.domain.cron.CronTrigger;
import okhttp3.OkHttpClient;

import java.util.List;

public abstract class DroneCron extends AbstractDroneBaseApi {

    protected String owner;

    protected String repo;

    protected String crone;

    public DroneCron(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public abstract DroneCron withOwner(String owner);

    public abstract DroneCron withRepo(String repo);

    public abstract DroneCron withCrone(String crone);

    public abstract boolean delete();

    public abstract Cron create(CronCreate cronCreate);

    public abstract Cron info();

    public abstract List<Cron> list();

    public abstract CronTrigger trigger();

    public abstract Cron update(CronCreate cronCreate);
}
