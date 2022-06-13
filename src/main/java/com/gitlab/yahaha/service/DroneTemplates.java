package com.gitlab.yahaha.service;

import com.gitlab.yahaha.domain.templates.CreateTemplate;
import com.gitlab.yahaha.domain.templates.Template;
import com.gitlab.yahaha.domain.templates.TemplateUpdate;
import okhttp3.OkHttpClient;

import java.util.List;

public abstract class DroneTemplates extends AbstractDroneBaseApi{

    protected String namespace;

    protected String name;

    public DroneTemplates(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public abstract DroneTemplates withNamespace(String namespace);

    public abstract DroneTemplates withName(String name);

    public abstract Template info();

    public abstract Template create(CreateTemplate createTemplate);

    public abstract boolean delete();

    public abstract List<Template> list();

    public abstract Template update(TemplateUpdate templateUpdate);
}
