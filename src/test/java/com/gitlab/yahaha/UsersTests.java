package com.gitlab.yahaha;

import com.gitlab.yahaha.domain.user.User;
import com.gitlab.yahaha.domain.user.UserCreate;
import com.gitlab.yahaha.domain.user.UserUpdate;
import com.gitlab.yahaha.service.DroneClient;
import com.gitlab.yahaha.service.DroneUsers;
import com.gitlab.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.List;

public class UsersTests {

    private String host = "http://drone.p92-dev.k";

    private String token = "RfjKHfNJR2px9UzUhwGPmcav9wpg9Gnb";

    private String login = "test";

    @Test
    public void usersAdd() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUsers droneUsers = droneClient.droneUsers();
        UserCreate userCreate = new UserCreate();
        userCreate.setActive(true);
        userCreate.setLogin(login);
        User user = droneUsers.create(userCreate);
        assert (user != null);
    }

    @Test
    public void usersInfo() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUsers droneUsers = droneClient.droneUsers();
        User user = droneUsers.withLogin(login).info();
        assert (user != null);
    }

    @Test
    public void usersList() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUsers droneUsers = droneClient.droneUsers();
        List<User> userList = droneUsers.list();
        assert (userList.size() > 0);
    }

    @Test
    public void usersUpdate() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUsers droneUsers = droneClient.droneUsers();
        UserUpdate userUpdate = new UserUpdate();
        userUpdate.setAdmin(false);
        userUpdate.setActive(false);
        User user = droneUsers.withLogin(login).update(userUpdate);
        assert (user != null);
    }

    @Test
    public void userDelete() {
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneUsers droneUsers = droneClient.droneUsers();
        boolean result = droneUsers.withLogin(login).delete();
        assert (result);
    }
}
