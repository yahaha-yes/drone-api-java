package com.github.yahaha.domain.build;

public class Step {
    private long id;
    private long step_id;
    private long number;
    private String name;
    private String status;
    private long exit_code;
    private long started;
    private long stopped;
    private long version;

    public void setStopped(long stopped) {
        this.stopped = stopped;
    }

    public void setExit_code(long exit_code) {
        this.exit_code = exit_code;
    }

    public long getStopped() {
        return stopped;
    }

    public long getExit_code() {
        return exit_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStarted() {
        return started;
    }

    public long getNumber() {
        return number;
    }

    public long getVersion() {
        return version;
    }

    public String getStatus() {
        return status;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setStarted(long started) {
        this.started = started;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getStep_id() {
        return step_id;
    }

    public void setStep_id(long step_id) {
        this.step_id = step_id;
    }

    @Override
    public String toString() {
        return "Step{" +
                "id=" + id +
                ", step_id=" + step_id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", exit_code=" + exit_code +
                ", started=" + started +
                ", stopped=" + stopped +
                ", version=" + version +
                '}';
    }
}
