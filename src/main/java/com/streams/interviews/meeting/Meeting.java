package com.streams.interviews.meeting;

public class Meeting {
    public Meeting(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    private final String name;
    private final int hours;

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }
}
