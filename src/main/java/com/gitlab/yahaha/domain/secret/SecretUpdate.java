package com.gitlab.yahaha.domain.secret;

public class SecretUpdate {
    private String data;
    private boolean pull_request;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isPull_request() {
        return pull_request;
    }

    public void setPull_request(boolean pull_request) {
        this.pull_request = pull_request;
    }

    @Override
    public String toString() {
        return "SecretUpdate{" +
                "data='" + data + '\'' +
                ", pull_request=" + pull_request +
                '}';
    }
}
