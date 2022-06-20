package com.github.yahaha.domain.templates;

public class TemplateUpdate {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TemplateUpdate{" +
                "data='" + data + '\'' +
                '}';
    }
}
