package com.gitlab.yahaha.domain.secret;

public class Secret {
    private long id;
    private long repo_id;
    private String name;
    private String data;
    private boolean pull_request;

    public void setRepo_id(long repo_id) {
        this.repo_id = repo_id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public boolean isPull_request() {
        return pull_request;
    }

    public long getRepo_id() {
        return repo_id;
    }

    public void setPull_request(boolean pull_request) {
        this.pull_request = pull_request;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "id=" + id +
                ", repo_id=" + repo_id +
                ", name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", pull_request=" + pull_request +
                '}';
    }
}
