package com.github.yahaha;

import com.github.yahaha.domain.templates.CreateTemplate;
import com.github.yahaha.domain.templates.Template;
import com.github.yahaha.domain.templates.TemplateUpdate;
import com.github.yahaha.service.DroneClient;
import com.github.yahaha.service.DroneTemplates;
import com.github.yahaha.service.impl.DefaultDroneClient;
import org.junit.Test;

import java.util.List;

public class TemplateTests {

    private String host = "http://drone.p92-dev.k";

    private String token = "RfjKHfNJR2px9UzUhwGPmcav9wpg9Gnb";

    private String name = "test.yaml";

    private String data = "# A YAML template example.\nkind: pipeline\ntype: docker\nname: default\nsteps:\n   - name: {{ .input.name }}\n     image: {{ .input.image }}\n     commands:\n        - {{ .input.commands }}\n";

    private String dataUpdate = "# YAML template example.\nkind: pipeline\ntype: docker\nname: default\nsteps:\n   - name: {{ .input.name }}\n     image: {{ .input.image }}\n     commands:\n        - {{ .input.commands }}\n";

    private String namespace ="ewivt";

    @Test
    public void templateCreate(){
        DroneClient droneClient = new DefaultDroneClient(host, token);
        DroneTemplates droneTemplates = droneClient.droneTemplates();
        CreateTemplate template = new CreateTemplate();
        template.setName(name);
        template.setData(data);
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
        templateUpdate.setData(dataUpdate);
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
