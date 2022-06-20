package com.github.yahaha.domain.user;

public class User {
    private int id;
    private String login;
    private String email;
    private String avatar_url;
    private boolean active;
    private boolean admin;
    private boolean machine;
    private boolean syncing;
    private long created;
    private long updated;
    private long last_login;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isAdmin() {
        return admin;
    }

    public boolean isMachine() {
        return machine;
    }

    public boolean isSyncing() {
        return syncing;
    }

    public long getCreated() {
        return created;
    }

    public long getLast_login() {
        return last_login;
    }

    public long getUpdated() {
        return updated;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLast_login(long last_login) {
        this.last_login = last_login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMachine(boolean machine) {
        this.machine = machine;
    }

    public void setSyncing(boolean syncing) {
        this.syncing = syncing;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", avatar_url='" + avatar_url + '\'' +
                ", active=" + active +
                ", admin=" + admin +
                ", machine=" + machine +
                ", syncing=" + syncing +
                ", created=" + created +
                ", updated=" + updated +
                ", last_login=" + last_login +
                '}';
    }
}
