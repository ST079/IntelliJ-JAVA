package com.basics;

public class Time {
    int hour, minute, second;
    public Time() {
        this.hour = this.minute = this.second = 0;
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour + (minute / 60) + (second / 3600);
        this.minute = (minute % 60) + (second / 60) % 60;
        this.second = second % 60;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }

    public Time add(Time oth){
        int hour = this.hour + oth.hour;
        int minute = this.minute + oth.minute;
        int second = this.second + oth.second;
        return new Time(hour, minute, second);
    }

    public Time subtract(Time oth){
        int hour = this.hour - oth.hour;
        int minute = this.minute - oth.minute;
        int second = this.second - oth.second;
        return new Time(hour, minute, second);
    }


    public static void main(String[] args) {
        Time t1 = new Time(2,65,69);
        Time t2 = new Time(2,65,69);
        Time add = t1.subtract(t2);
        t1.displayTime();
        t2.displayTime();
        add.displayTime();
    }
}
