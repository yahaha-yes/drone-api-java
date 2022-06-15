package com.gitlab.yahaha.domain.cron;

public class CronCreate {

    private String name;

    private String expr;

    private String branch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "Crone{" +
                "name='" + name + '\'' +
                ", expr='" + expr + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
