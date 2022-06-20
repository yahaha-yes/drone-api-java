package com.github.yahaha.domain.repo;

import org.codehaus.jackson.annotate.JsonProperty;

public class RepoUpdate {
    private String config_path;
    @JsonProperty(value = "protected")
    private boolean isProtected;
    private boolean trusted;
    private int timeout;
    private String visibility;

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public void setConfig_path(String config_path) {
        this.config_path = config_path;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getConfig_path() {
        return config_path;
    }

    public int getTimeout() {
        return timeout;
    }

    public boolean isTrusted() {
        return trusted;
    }

    public boolean isProtected() {
        return isProtected;
    }

    @Override
    public String toString() {
        return "RepoUpdate{" +
                "config_path='" + config_path + '\'' +
                ", isProtected=" + isProtected +
                ", trusted=" + trusted +
                ", timeout=" + timeout +
                ", visibility='" + visibility + '\'' +
                '}';
    }
}
