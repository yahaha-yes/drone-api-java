package com.github.yahaha;

import com.github.yahaha.domain.cron.Cron;
import com.github.yahaha.domain.cron.CronCreate;
import com.github.yahaha.domain.cron.CronTrigger;
import com.github.yahaha.service.DroneClient;
import com.github.yahaha.service.DroneCron;
import com.github.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.List;

public class CronTests {

    private String host = "http://drone.p92-dev.k";

    private String token = "RfjKHfNJR2px9UzUhwGPmcav9wpg9Gnb";

    private String repo = "freight-app";

    private String owner = "ewivt";

    private String name = "test";

    @Test
    public void cronCreate() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        CronCreate cronCreate = new CronCreate();
        cronCreate.setBranch("master");
        cronCreate.setName(name);
        cronCreate.setExpr("0 0 * * * ");
        Cron cron = droneCron.withOwner(owner).withRepo(repo).create(cronCreate);
        assert (cron != null);
    }

    @Test
    public void cronInfo() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        Cron cron = droneCron.withOwner(owner).withRepo(repo).withCrone(name).info();
        assert (cron != null);
    }

    @Test
    public void cronList() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        List<Cron> cronList = droneCron.withOwner(owner).withRepo(repo).list();
        assert (cronList.size() > 0);
    }

    @Test
    public void cronTrigger() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        CronTrigger cronTrigger = droneCron.withOwner(owner).withRepo(repo).withCrone(name).trigger();
        assert (cronTrigger != null);
    }

    @Test
    public void cronUpdate() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        CronCreate cronCreate = new CronCreate();
        cronCreate.setBranch("master");
        cronCreate.setName(name);
        cronCreate.setExpr("1 1 * * * ? ");
        Cron cron = droneCron.withOwner(owner).withRepo(repo).withCrone(name).update(cronCreate);
        assert (cron != null);
    }

    @Test
    public void cronDelete() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        boolean result = droneCron.withOwner(owner).withRepo(repo).withCrone(name).delete();
        assert (result);
    }
}
