package com.gitlab.yahaha;

import com.gitlab.yahaha.domain.repo.Repo;
import com.gitlab.yahaha.domain.user.User;
import com.gitlab.yahaha.service.DroneClient;
import com.gitlab.yahaha.service.DroneUser;
import com.gitlab.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.List;

public class UserTests {

    private String host = "";

    private String token = "";

    @Test
    public void userFeed() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUser droneUser = droneClient.droneUser();
        Object result = droneUser.feed();
        assert (result != null);
    }

    @Test
    public void userInfo() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUser droneUser = droneClient.droneUser();
        User user = droneUser.info();
        assert (user != null);
    }

    @Test
    public void userRepo() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUser droneUser = droneClient.droneUser();
        List<Repo> repoList = droneUser.userRepos();
        assert (repoList.size() > 0);
    }

    @Test
    public void userSync() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUser droneUser = droneClient.droneUser();
        boolean result = droneUser.sync();
        assert (result);
    }
}
