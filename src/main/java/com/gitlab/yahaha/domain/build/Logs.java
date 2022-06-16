package com.gitlab.yahaha.domain.build;

public class Logs {
    private String out;
    private int pos;
    private int time;

    public int getPos() {
        return pos;
    }

    public int getTime() {
        return time;
    }

    public String getOut() {
        return out;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Logs{" +
                "out='" + out + '\'' +
                ", pos=" + pos +
                ", time=" + time +
                '}';
    }
}
