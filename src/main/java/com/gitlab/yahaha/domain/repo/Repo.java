package com.gitlab.yahaha.domain.repo;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.Objects;

public class Repo {
    private int id;
    private String uid;
    private String slug;
    private String scm;
    private String git_http_url;
    private String git_ssh_url;
    private String link;
    private String default_branch;
    @JsonProperty(value = "private")
    private boolean isPrivate;
    private String visibility;
    private boolean active;
    private String config_path;
    private boolean trusted;
    @JsonProperty(value = "protected")
    private boolean isProtected;
    private boolean ignore_forks;
    private boolean ignore_pull_requests;
    private int timeout;
    private int counter;
    private int synced;
    private int created;
    private int updated;
    private int version;

    public boolean isActive() {
        return active;
    }

    public boolean isIgnore_forks() {
        return ignore_forks;
    }

    public boolean isIgnore_pull_requests() {
        return ignore_pull_requests;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public boolean isTrusted() {
        return trusted;
    }

    public int getCounter() {
        return counter;
    }

    public int getCreated() {
        return created;
    }

    public int getSynced() {
        return synced;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getUpdated() {
        return updated;
    }

    public int getVersion() {
        return version;
    }

    public int getId() {
        return id;
    }

    public String getConfig_path() {
        return config_path;
    }

    public String getDefault_branch() {
        return default_branch;
    }

    public String getGit_http_url() {
        return git_http_url;
    }

    public String getGit_ssh_url() {
        return git_ssh_url;
    }

    public String getLink() {
        return link;
    }

    public String getScm() {
        return scm;
    }

    public String getSlug() {
        return slug;
    }

    public String getUid() {
        return uid;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setConfig_path(String config_path) {
        this.config_path = config_path;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    public void setGit_http_url(String git_http_url) {
        this.git_http_url = git_http_url;
    }

    public void setGit_ssh_url(String git_ssh_url) {
        this.git_ssh_url = git_ssh_url;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIgnore_forks(boolean ignore_forks) {
        this.ignore_forks = ignore_forks;
    }

    public void setIgnore_pull_requests(boolean ignore_pull_requests) {
        this.ignore_pull_requests = ignore_pull_requests;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public void setScm(String scm) {
        this.scm = scm;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setSynced(int synced) {
        this.synced = synced;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repo repo = (Repo) o;
        return isPrivate == repo.isPrivate && active == repo.active && trusted == repo.trusted && isProtected == repo.isProtected && ignore_forks == repo.ignore_forks && ignore_pull_requests == repo.ignore_pull_requests && timeout == repo.timeout && counter == repo.counter && synced == repo.synced && created == repo.created && updated == repo.updated && version == repo.version && Objects.equals(id, repo.id) && Objects.equals(uid, repo.uid) && Objects.equals(slug, repo.slug) && Objects.equals(scm, repo.scm) && Objects.equals(git_http_url, repo.git_http_url) && Objects.equals(git_ssh_url, repo.git_ssh_url) && Objects.equals(link, repo.link) && Objects.equals(default_branch, repo.default_branch) && Objects.equals(visibility, repo.visibility) && Objects.equals(config_path, repo.config_path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, slug, scm, git_http_url, git_ssh_url, link, default_branch, isPrivate, visibility, active, config_path, trusted, isProtected, ignore_forks, ignore_pull_requests, timeout, counter, synced, created, updated, version);
    }

    @Override
    public String toString() {
        return "Repo{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", slug='" + slug + '\'' +
                ", scm='" + scm + '\'' +
                ", git_http_url='" + git_http_url + '\'' +
                ", git_ssh_url='" + git_ssh_url + '\'' +
                ", link='" + link + '\'' +
                ", default_branch='" + default_branch + '\'' +
                ", isPrivate=" + isPrivate +
                ", visibility='" + visibility + '\'' +
                ", active=" + active +
                ", config_path='" + config_path + '\'' +
                ", trusted=" + trusted +
                ", isProtected=" + isProtected +
                ", ignore_forks=" + ignore_forks +
                ", ignore_pull_requests=" + ignore_pull_requests +
                ", timeout=" + timeout +
                ", counter=" + counter +
                ", synced=" + synced +
                ", created=" + created +
                ", updated=" + updated +
                ", version=" + version +
                '}';
    }
}
