package com.gitlab.yahaha.domain.build;

import java.util.List;

public class Build {
        private long id;
        private long repo_id;
        private long number;
        private String status;
        private String event;
        private String action;
        private String link;
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
        private long started;
        private long finished;
        private long created;
        private long  updated;
        private long version;
        private List<Stage> stages;

        public long getRepo_id() {
                return repo_id;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public void setRepo_id(long repo_id) {
                this.repo_id = repo_id;
        }

        public long getCreated() {
                return created;
        }

        public long getUpdated() {
                return updated;
        }

        public void setCreated(long created) {
                this.created = created;
        }

        public void setUpdated(long updated) {
                this.updated = updated;
        }

        public List<Stage> getStages() {
                return stages;
        }

        public long getFinished() {
                return finished;
        }

        public long getNumber() {
                return number;
        }

        public long getStarted() {
                return started;
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

        public String getEvent() {
                return event;
        }

        public String getLink() {
                return link;
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

        public String getStatus() {
                return status;
        }

        public String getSource_repo() {
                return source_repo;
        }

        public String getTarget() {
                return target;
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

        public void setEvent(String event) {
                this.event = event;
        }

        public void setFinished(long finished) {
                this.finished = finished;
        }

        public void setVersion(long version) {
                this.version = version;
        }

        public void setLink(String link) {
                this.link = link;
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

        public void setSender(String sender) {
                this.sender = sender;
        }

        public void setSource(String source) {
                this.source = source;
        }

        public void setSource_repo(String source_repo) {
                this.source_repo = source_repo;
        }

        public void setStages(List<Stage> stages) {
                this.stages = stages;
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

        @Override
        public String toString() {
                return "Build{" +
                        "id=" + id +
                        ", repo_id=" + repo_id +
                        ", number=" + number +
                        ", status='" + status + '\'' +
                        ", event='" + event + '\'' +
                        ", action='" + action + '\'' +
                        ", link='" + link + '\'' +
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
                        ", started=" + started +
                        ", finished=" + finished +
                        ", created=" + created +
                        ", updated=" + updated +
                        ", version=" + version +
                        ", stages=" + stages +
                        '}';
        }
}
