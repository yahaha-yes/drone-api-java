package com.gitlab.yahaha.domain.user;

public class UserCreate {
    private String login;
    private String email;
    private String avatar_url;
    private boolean active;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "UserCreate{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", avatar_url='" + avatar_url + '\'' +
                ", active=" + active +
                '}';
    }
}
