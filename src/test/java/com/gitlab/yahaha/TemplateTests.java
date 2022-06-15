package com.gitlab.yahaha;

import com.gitlab.yahaha.domain.templates.CreateTemplate;
import com.gitlab.yahaha.domain.templates.Template;
import com.gitlab.yahaha.domain.templates.TemplateUpdate;
import com.gitlab.yahaha.service.DroneClient;
import com.gitlab.yahaha.service.DroneTemplates;
import com.gitlab.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.List;

public class TemplateTests {
    private String host = "";

    private String token = "";

    private String name = "test";

    private String namespace ="";

    @Test
    public void templateCreate(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneTemplates droneTemplates = droneClient.droneTemplates();
        CreateTemplate template = new CreateTemplate();
        template.setName(name);
        template.setData("");
        Template result = droneTemplates.withNamespace(namespace).create(template);
        assert(result!=null);
    }

    @Test
    public void templateInfo(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneTemplates droneTemplates = droneClient.droneTemplates();
        Template result = droneTemplates.withNamespace(namespace).withName(name).info();
        assert(result!=null);
    }

    @Test
    public void templateList(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneTemplates droneTemplates = droneClient.droneTemplates();
        List<Template> result = droneTemplates.withNamespace(namespace).list();
        assert(result.size()>0);
    }

    @Test
    public void templateUpdate(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneTemplates droneTemplates = droneClient.droneTemplates();
        TemplateUpdate templateUpdate = new TemplateUpdate();
        templateUpdate.setData("test");
        Template result = droneTemplates.withNamespace(namespace).withName(name).update(templateUpdate);
        assert(result!=null);
    }

    @Test
    public void templateDelete(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneTemplates droneTemplates = droneClient.droneTemplates();
        boolean result = droneTemplates.withNamespace(namespace).withName(name).delete();
        assert(result);
    }
}
