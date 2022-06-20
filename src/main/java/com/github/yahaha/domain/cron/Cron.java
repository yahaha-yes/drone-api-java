package com.github.yahaha.domain.cron;

public class Cron {
    private long id;
    private long repo_id;
    private String name;
    private String expr;
    private String branch;
    private long next;
    private long pref;
    private long created;
    private long updated;

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public String getExpr() {
        return expr;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public long getUpdated() {
        return updated;
    }

    public long getId() {
        return id;
    }

    public long getCreated() {
        return created;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRepo_id() {
        return repo_id;
    }

    public long getNext() {
        return next;
    }

    public long getPref() {
        return pref;
    }

    public void setNext(long next) {
        this.next = next;
    }

    public void setPref(long pref) {
        this.pref = pref;
    }

    public void setRepo_id(long repo_id) {
        this.repo_id = repo_id;
    }

    @Override
    public String toString() {
        return "Crone{" +
                "id=" + id +
                ", repo_id=" + repo_id +
                ", name='" + name + '\'' +
                ", expr='" + expr + '\'' +
                ", branch='" + branch + '\'' +
                ", next=" + next +
                ", pref=" + pref +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
