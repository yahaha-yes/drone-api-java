package com.github.yahaha.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.yahaha.domain.templates.CreateTemplate;
import com.github.yahaha.domain.templates.Template;
import com.github.yahaha.domain.templates.TemplateUpdate;
import com.github.yahaha.service.DroneTemplates;
import com.github.yahaha.common.Utils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import static com.github.yahaha.common.DroneAPIsUtils.TEMPLATES_API_URL;

public class DefaultDroneTemplatesImpl extends DroneTemplates {

    private static Logger logger = Logger.getLogger(DefaultDroneTemplatesImpl.class.toString());

    public DefaultDroneTemplatesImpl(OkHttpClient okHttpClient) {
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
        if (this.namespace == null) {
            logger.info("namespace is null or empty!");
            return null;
        }
        if (this.name == null) {
            logger.info("name is null or empty!");
            return null;
        }
        String requestUrl = url + TEMPLATES_API_URL + "/" + namespace + "/" + name;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Template.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public Template create(CreateTemplate createTemplate) {
        if (this.namespace == null) {
            logger.info("namespace is null or empty!");
            return null;
        }
        String requestUrl = url + TEMPLATES_API_URL + "/" + namespace;
        RequestBody body = RequestBody.create(JSON.toJSONString(createTemplate), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .post(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            if (response.code()!=200){
                return null;
            }
            return JSON.parseObject(response.body().string(), Template.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean delete() {
        if (this.namespace == null) {
            logger.info("namespace is null or empty!");
            return false;
        }
        if (this.name == null) {
            logger.info("name is null or empty!");
            return false;
        }
        String requestUrl = url + TEMPLATES_API_URL + "/" + namespace + "/" + name;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .delete()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.code() < 300;
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return false;
        }
    }

    @Override
    public List<Template> list() {
        if (this.namespace == null) {
            logger.info("owner is null or empty!");
            return null;
        }
        String requestUrl = url + TEMPLATES_API_URL + "/" + namespace;
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .get()
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), new TypeReference<ArrayList<Template>>() {
            });
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public Template update(TemplateUpdate templateUpdate) {
        if (this.namespace == null) {
            logger.info("namespace is null or empty!");
            return null;
        }
        if (this.name == null) {
            logger.info("name is null or empty!");
            return null;
        }
        String requestUrl = url + TEMPLATES_API_URL + "/" + namespace + "/" + name;
        RequestBody body = RequestBody.create(JSON.toJSONString(templateUpdate), Utils.getJsonMediaType());
        Request request = new Request.Builder()
                .addHeader(HEADER, token)
                .url(requestUrl)
                .patch(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return JSON.parseObject(response.body().string(), Template.class);
        } catch (Exception exception) {
            logger.info(exception.getMessage());
            return null;
        }
    }
}
