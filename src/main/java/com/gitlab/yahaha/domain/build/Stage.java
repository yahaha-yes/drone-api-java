package com.gitlab.yahaha.domain.build;

public class Stage {
    private long id;
    private long repo_id;
    private long build_id;
    private long number;
    private String name;
    private String kind;
    private String type;
    private String status;
    private boolean errignore;
    private long exit_code;
    private String machine;
    private String os;
    private String arch;
    private long started;
    private long stopped;
    private long created;
    private long updated;
    private long version;
    private boolean on_success;
    private boolean on_failure;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStarted(long started) {
        this.started = started;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public long getVersion() {
        return version;
    }

    public long getNumber() {
        return number;
    }

    public long getStarted() {
        return started;
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

    public long getCreated() {
        return created;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRepo_id(long repo_id) {
        this.repo_id = repo_id;
    }

    public long getId() {
        return id;
    }

    public long getRepo_id() {
        return repo_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public boolean isErrignore() {
        return errignore;
    }

    public boolean isOn_failure() {
        return on_failure;
    }

    public boolean isOn_success() {
        return on_success;
    }

    public long getBuild_id() {
        return build_id;
    }

    public long getExit_code() {
        return exit_code;
    }

    public long getStopped() {
        return stopped;
    }

    public String getArch() {
        return arch;
    }

    public String getKind() {
        return kind;
    }

    public String getMachine() {
        return machine;
    }

    public String getOs() {
        return os;
    }

    public String getType() {
        return type;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public void setBuild_id(long build_id) {
        this.build_id = build_id;
    }

    public void setErrignore(boolean errignore) {
        this.errignore = errignore;
    }

    public void setExit_code(long exit_code) {
        this.exit_code = exit_code;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setOn_failure(boolean on_failure) {
        this.on_failure = on_failure;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setOn_success(boolean on_success) {
        this.on_success = on_success;
    }

    public void setStopped(long stopped) {
        this.stopped = stopped;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", repo_id=" + repo_id +
                ", build_id=" + build_id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", errignore=" + errignore +
                ", exit_code=" + exit_code +
                ", machine='" + machine + '\'' +
                ", os='" + os + '\'' +
                ", arch='" + arch + '\'' +
                ", started=" + started +
                ", stopped=" + stopped +
                ", created=" + created +
                ", updated=" + updated +
                ", version=" + version +
                ", on_success=" + on_success +
                ", on_failure=" + on_failure +
                '}';
    }
}
