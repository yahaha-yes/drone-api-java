package com.gitlab.yahaha.domain.secret;

public class SecretCreate {
    private String name;
    private String data;
    private boolean pull_request;

    public void setPull_request(boolean pull_request) {
        this.pull_request = pull_request;
    }

    public boolean isPull_request() {
        return pull_request;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SecretCreate{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", pull_request=" + pull_request +
                '}';
    }
}
