package com.github.yahaha.domain.templates;

public class CreateTemplate {
    public String name;
    private String data;

    public void setName(String name) {
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "CreateTemplate{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
