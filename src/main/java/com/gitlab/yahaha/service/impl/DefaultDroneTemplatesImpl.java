package com.gitlab.yahaha.service.impl;

import com.gitlab.yahaha.domain.templates.CreateTemplate;
import com.gitlab.yahaha.domain.templates.Template;
import com.gitlab.yahaha.service.DroneTemplates;
import okhttp3.OkHttpClient;

import java.util.List;

public class DefaultDroneTemplatesImpl extends DroneTemplates {

    public DefaultDroneTemplatesImpl(OkHttpClient okHttpClient){
        super(okHttpClient);
    }

    @Override
    public DroneTemplates withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public DroneTemplates withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Template info() {
        return null;
    }

    @Override
    public Template create(CreateTemplate createTemplate) {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public List<Template> list() {
        return null;
    }

    @Override
    public Template update(String data) {
        return null;
    }
}
