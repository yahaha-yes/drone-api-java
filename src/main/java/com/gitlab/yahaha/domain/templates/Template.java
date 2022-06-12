package com.gitlab.yahaha.domain.templates;

public class Template {
    private int id;
    private String name;
    private String namespace;
    private String data;

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public String toString() {
        return "Template{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", namespace='" + namespace + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
