package oop_1_8;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return "%02d:%02d:%02d".formatted(hour, minute, second);
    }

    public Time nextSecond() {

        if (hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
        } else {
            second++;
        }
        return this;

    }

    public Time previousSecond() {

        if (second == 0 && minute == 0 && hour == 0) {
            second = 59;
            minute = 59;
            hour = 23;
        } else {
            second--;
        }
        return this;

    }

}
