package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.service.*;
import okhttp3.OkHttpClient;

public class DefaultDroneClient implements DroneClient {

    private String baseUrl;

    private OkHttpClient okHttpClient = new OkHttpClient();

    private String bearerToken ="Bearer ";

    public DefaultDroneClient(String baseUrl, String token){
        this.bearerToken = bearerToken+token;
        this.baseUrl = baseUrl;
    }

    @Override
    public DroneCron droneCon() {
        DroneCron droneCron = new DefaultDroneCronImpl(okHttpClient);
        droneCron.withToken(bearerToken);
        droneCron.withUrl(baseUrl);
        return droneCron;
    }

    @Override
    public DroneBuilds droneBuilds() {
        DroneBuilds droneBuilds = new DefaultDroneBuildsImpl(okHttpClient);
        droneBuilds.withToken(bearerToken);
        droneBuilds.withUrl(baseUrl);
        return droneBuilds;
    }

    @Override
    public DroneUser droneUser() {
        DroneUser droneUser = new DefaultDroneUserImpl(okHttpClient);
        droneUser.withToken(bearerToken);
        droneUser.withUrl(baseUrl);
        return droneUser;
    }

    @Override
    public DroneSecrets droneSecrets() {
        DroneSecrets droneSecrets = new DefaultDroneSecretsImpl(okHttpClient);
        droneSecrets.withToken(bearerToken);
        droneSecrets.withUrl(baseUrl);
        return droneSecrets;
    }

    @Override
    public DroneRepos droneRepos() {
        DroneRepos droneRepos = new DefaultDroneReposImpl(okHttpClient);
        droneRepos.withToken(bearerToken);
        droneRepos.withUrl(baseUrl);
        return droneRepos;
    }

    @Override
    public DroneTemplates droneTemplates() {
        DroneTemplates droneTemplates = new DefaultDroneTemplatesImpl(okHttpClient);
        droneTemplates.withToken(bearerToken);
        droneTemplates.withUrl(baseUrl);
        return droneTemplates;
    }

    @Override
    public DroneUsers droneUsers() {
        DroneUsers droneUsers = new DefaultDroneUsersImpl(okHttpClient);
        droneUsers.withToken(bearerToken);
        droneUsers.withUrl(baseUrl);
        return droneUsers;
    }
}
