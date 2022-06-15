package com.gitlab.yahaha;

import com.gitlab.yahaha.domain.build.Build;
import com.gitlab.yahaha.domain.build.Logs;
import com.gitlab.yahaha.service.DroneBuilds;
import com.gitlab.yahaha.service.DroneClient;
import com.gitlab.yahaha.service.DroneRepos;
import com.gitlab.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class BuildTests {
    private String host = "";

    private String token = "";

    protected String owner = "";

    protected String repo = "";

    protected String build = "";

    protected String branch = "";

    protected String commit = "";

    protected HashMap<String, String> env = new HashMap<>();

    @Test
    public void buildApprove() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneBuilds droneBuilds = droneClient.droneBuilds();
        boolean result = droneBuilds.withOwner(owner).withRepo(repo).withBuild(build).approve();
        assert (result);
    }

    @Test
    public void buildCreate() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneBuilds droneBuilds = droneClient.droneBuilds();
        Build result = droneBuilds.withOwner(owner).withRepo(repo).withBuild(build).create();
        assert (result != null);
    }

    @Test
    public void buildDecline() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneBuilds droneBuilds = droneClient.droneBuilds();
        boolean result = droneBuilds.withOwner(owner).withRepo(repo).withBuild(build).decline();
        assert (result);
    }

    @Test
    public void buildInfo() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneBuilds droneBuilds = droneClient.droneBuilds();
        Build result = droneBuilds.withOwner(owner).withRepo(repo).withBuild(build).info();
        assert (result != null);
    }

    @Test
    public void buildList() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneBuilds droneBuilds = droneClient.droneBuilds();
        List<Build> result = droneBuilds.withOwner(owner).withRepo(repo).list();
        assert (result.size() > 0);
    }

    @Test
    public void buildLogs() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneBuilds droneBuilds = droneClient.droneBuilds();
        List<Logs> logs = droneBuilds.withOwner(owner).withRepo(repo).withBuild(build).logs(1, 1);
        assert (logs.size() > 0);
    }

    @Test
    public void buildPromote() {
        // TODO()
    }

    @Test
    public void buildRestart() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneBuilds droneBuilds = droneClient.droneBuilds();
        Build result = droneBuilds.withOwner(owner).withRepo(repo).withBuild(build).restart();
        assert (result != null);
    }

    @Test
    public void buildStop() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneBuilds droneBuilds = droneClient.droneBuilds();
        boolean result = droneBuilds.withOwner(owner).withRepo(repo).withBuild(build).stop();
        assert (result);
    }
}
