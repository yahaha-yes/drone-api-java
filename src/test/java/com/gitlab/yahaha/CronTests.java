package com.gitlab.yahaha;

import com.gitlab.yahaha.domain.cron.Cron;
import com.gitlab.yahaha.domain.cron.CronCreate;
import com.gitlab.yahaha.domain.cron.CronTrigger;
import com.gitlab.yahaha.service.DroneClient;
import com.gitlab.yahaha.service.DroneCron;
import com.gitlab.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.List;

public class CronTests {
    private String host = "";

    private String token = "";

    private String repo = "";

    private String owner = "";

    private String name = "";

    @Test
    public void croneCreate() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        CronCreate cronCreate = new CronCreate();
        cronCreate.setBranch("master");
        cronCreate.setName(name);
        cronCreate.setExpr("0 * * * * ? ");
        Cron cron = droneCron.withOwner(owner).withRepo(repo).create(cronCreate);
        assert (cron != null);
    }

    @Test
    public void croneInfo() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        Cron cron = droneCron.withOwner(owner).withRepo(repo).withCrone(name).info();
        assert (cron != null);
    }

    @Test
    public void croneList() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        List<Cron> cronList = droneCron.withOwner(owner).withRepo(repo).list();
        assert (cronList.size() > 0);
    }

    @Test
    public void croneTrigger() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        CronTrigger cronTrigger = droneCron.withOwner(owner).withRepo(repo).withCrone(name).trigger();
        assert (cronTrigger != null);
    }

    @Test
    public void croneUpdate() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        CronCreate cronCreate = new CronCreate();
        cronCreate.setBranch("master");
        cronCreate.setName(name);
        cronCreate.setExpr("0 0 * * * ? ");
        Cron cron = droneCron.withOwner(owner).withRepo(repo).withCrone(name).update(cronCreate);
        assert (cron != null);
    }

    @Test
    public void croneDelete() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneCron droneCron = droneClient.droneCon();
        boolean result = droneCron.withOwner(owner).withRepo(repo).withCrone(name).delete();
        assert (result);
    }
}
