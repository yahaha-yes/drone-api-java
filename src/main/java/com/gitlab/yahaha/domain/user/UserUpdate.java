package com.gitlab.yahaha.domain.user;

public class UserUpdate {
    private String email;
    private boolean admin;
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public String getEmail() {
        return email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    @Override
    public String toString() {
        return "UserUpdate{" +
                "email='" + email + '\'' +
                ", admin=" + admin +
                ", active=" + active +
                '}';
    }
}
