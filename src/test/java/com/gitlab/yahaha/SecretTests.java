package com.gitlab.yahaha;

import com.gitlab.yahaha.domain.secret.Secret;
import com.gitlab.yahaha.domain.secret.SecretCreate;
import com.gitlab.yahaha.domain.secret.SecretUpdate;
import com.gitlab.yahaha.service.DroneClient;
import com.gitlab.yahaha.service.DroneSecrets;
import com.gitlab.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.List;

public class SecretTests {
    private String host = "";

    private String token = "";

    private String repo="";

    private String owner="";

    private String name = "test";

    @Test
    public void secretCreate(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneSecrets droneSecrets = droneClient.droneSecrets();
        SecretCreate secretCreate = new SecretCreate();
        secretCreate.setName(name);
        secretCreate.setData("123");
        secretCreate.setPull_request(true);
        Secret secret = droneSecrets.withOwner(owner).withRepo(repo).create(secretCreate);
        assert(secret!=null);
    }

    @Test
    public void secretInfo(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneSecrets droneSecrets = droneClient.droneSecrets();
        Secret secret = droneSecrets.withOwner(owner).withRepo(repo).withSecret(name).info();
        assert(secret!=null);
    }

    @Test
    public void secretList(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneSecrets droneSecrets = droneClient.droneSecrets();
        List<Secret> secretList = droneSecrets.withOwner(owner).withRepo(repo).list();
        assert(secretList.size()>0);
    }

    @Test
    public void secretUpdate(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneSecrets droneSecrets = droneClient.droneSecrets();
        SecretUpdate secretUpdate = new SecretUpdate();
        secretUpdate.setData("321");
        secretUpdate.setPull_request(false);
        Secret secret = droneSecrets.withOwner(owner).withRepo(repo).withSecret(name).update(secretUpdate);
        assert(secret!=null);
    }

    @Test
    public void secretDelete(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneSecrets droneSecrets = droneClient.droneSecrets();
        boolean result = droneSecrets.withOwner(owner).withRepo(repo).withSecret(name).delete();
        assert(result);
    }
}
