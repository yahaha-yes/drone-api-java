package com.github.yahaha;

import com.github.yahaha.domain.repo.Repo;
import com.github.yahaha.domain.repo.RepoUpdate;
import com.github.yahaha.service.DroneClient;
import com.github.yahaha.service.DroneRepos;
import com.github.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.List;

public class RepoTests {

    private String host = "http://drone.p92-dev.k";

    private String token = "RfjKHfNJR2px9UzUhwGPmcav9wpg9Gnb";

    private String repo = "freight-app";

    private String owner = "ewivt";

    @Test
    public void repoChown() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneRepos droneCron = droneClient.droneRepos();
        boolean result = droneCron.withOwner(owner).withRepo(repo).chown();
        assert (result);
    }

    @Test
    public void repoDisable() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneRepos droneCron = droneClient.droneRepos();
        boolean result = droneCron.withOwner(owner).withRepo(repo).disable();
        assert (result);
    }

    @Test
    public void repoEnable() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneRepos droneCron = droneClient.droneRepos();
        boolean result = droneCron.withOwner(owner).withRepo(repo).enable();
        assert (result);
    }

    @Test
    public void repoInfo() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneRepos droneCron = droneClient.droneRepos();
        Repo result = droneCron.withOwner(owner).withRepo(repo).info();
        assert (result != null);
    }

    @Test
    public void repoList() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneRepos droneCron = droneClient.droneRepos();
        List<Repo> repoList = droneCron.withOwner(owner).listRepos();
        assert (repoList.size() > 0);
    }

    @Test
    public void repoRepair() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneRepos droneCron = droneClient.droneRepos();
        boolean result = droneCron.withOwner(owner).withRepo(repo).repair();
        assert (result);
    }

    @Test
    public void repoUpdate() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneRepos droneCron = droneClient.droneRepos();
        RepoUpdate repoUpdate = new RepoUpdate();
        repoUpdate.setTrusted(true);
        repoUpdate.setProtected(false);
        Repo result = droneCron.withOwner(owner).withRepo(repo).update(repoUpdate);
        assert (result != null);
    }
}
