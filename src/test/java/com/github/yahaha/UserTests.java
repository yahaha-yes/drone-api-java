package com.github.yahaha;

import com.github.yahaha.domain.repo.Repo;
import com.github.yahaha.domain.user.User;
import com.github.yahaha.service.DroneClient;
import com.github.yahaha.service.DroneUser;
import com.github.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.List;

public class UserTests {

    private String host = "http://drone.p92-dev.k";

    private String token = "RfjKHfNJR2px9UzUhwGPmcav9wpg9Gnb";

    @Test
    public void userFeed() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUser droneUser = droneClient.droneUser();
        List<Repo> result = droneUser.feed();
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
