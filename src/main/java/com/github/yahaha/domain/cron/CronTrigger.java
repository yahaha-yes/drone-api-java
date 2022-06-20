package com.github.yahaha.domain.cron;

public class CronTrigger {
    private long id;
    private long repo_id;
    private String trigger;
    private long number;
    private String status;
    private String event;
    private String action;
    private String link;
    private long timestamp;
    private String message;
    private String before;
    private String after;
    private String ref;
    private String source_repo;
    private String source;
    private String target;
    private String author_login;
    private String author_name;
    private String author_email;
    private String author_avatar;
    private String sender;
    private String cron;
    private long started;
    private long finished;
    private long created;
    private long updated;
    private long version;

    public void setVersion(long version) {
        this.version = version;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getLink() {
        return link;
    }

    public long getCreated() {
        return created;
    }

    public long getFinished() {
        return finished;
    }

    public long getId() {
        return id;
    }

    public long getNumber() {
        return number;
    }

    public long getRepo_id() {
        return repo_id;
    }

    public long getStarted() {
        return started;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getUpdated() {
        return updated;
    }

    public long getVersion() {
        return version;
    }

    public String getAction() {
        return action;
    }

    public String getAfter() {
        return after;
    }

    public String getAuthor_avatar() {
        return author_avatar;
    }

    public String getAuthor_email() {
        return author_email;
    }

    public String getAuthor_login() {
        return author_login;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getBefore() {
        return before;
    }

    public String getCron() {
        return cron;
    }

    public String getEvent() {
        return event;
    }

    public String getMessage() {
        return message;
    }

    public String getRef() {
        return ref;
    }

    public String getSender() {
        return sender;
    }

    public String getSource() {
        return source;
    }

    public String getSource_repo() {
        return source_repo;
    }

    public String getStatus() {
        return status;
    }

    public String getTarget() {
        return target;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public void setAuthor_avatar(String author_avatar) {
        this.author_avatar = author_avatar;
    }

    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }

    public void setAuthor_login(String author_login) {
        this.author_login = author_login;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setFinished(long finished) {
        this.finished = finished;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setRepo_id(long repo_id) {
        this.repo_id = repo_id;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setSource_repo(String source_repo) {
        this.source_repo = source_repo;
    }

    public void setStarted(long started) {
        this.started = started;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    @Override
    public String toString() {
        return "CroneTrigger{" +
                "id=" + id +
                ", repo_id=" + repo_id +
                ", trigger='" + trigger + '\'' +
                ", number=" + number +
                ", status='" + status + '\'' +
                ", event='" + event + '\'' +
                ", action='" + action + '\'' +
                ", link='" + link + '\'' +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", before='" + before + '\'' +
                ", after='" + after + '\'' +
                ", ref='" + ref + '\'' +
                ", source_repo='" + source_repo + '\'' +
                ", source='" + source + '\'' +
                ", target='" + target + '\'' +
                ", author_login='" + author_login + '\'' +
                ", author_name='" + author_name + '\'' +
                ", author_email='" + author_email + '\'' +
                ", author_avatar='" + author_avatar + '\'' +
                ", sender='" + sender + '\'' +
                ", cron='" + cron + '\'' +
                ", started=" + started +
                ", finished=" + finished +
                ", created=" + created +
                ", updated=" + updated +
                ", version=" + version +
                '}';
    }
}
