package com.github.yahaha.service;

public interface DroneClient {
    DroneCron droneCon();
    DroneBuilds droneBuilds();
    DroneUser droneUser();
    DroneSecrets droneSecrets();
    DroneRepos droneRepos();
    DroneTemplates droneTemplates();
    DroneUsers droneUsers();
}
