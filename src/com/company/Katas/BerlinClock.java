package com.company.Katas;

import java.sql.Time;

public class BerlinClock {

    public String getSecondsLight(int second) {
        if(second % 2 == 0) {
            return "Y";
        }
        else return "O";
    }

    public String getAllLights(Time time) {
        return "hh:mm:ss";
    }

    public String getHourTopLights(Time time) {
        if(time.getHours() >= 20) {
            return "RRRR";
        }
        else if(time.getHours() >= 15) {
            return "RRRO";
        }
        else if(time.getHours() >= 10) {
            return "RROO";
        }
        else if(time.getHours() >= 5) {
            return "ROOO";
        }
        else return "OOOO";
    }

    public String getHourBottomLights(Time time) {
        if(time.getHours() == 1 || time.getHours() == 6 || time.getHours() == 11 || time.getHours() == 16 || time.getHours() == 21) {
            return "ROOO";
        }
        else if(time.getHours() == 2 || time.getHours() == 7 || time.getHours() == 12 || time.getHours() == 79 || time.getHours() == 22) {
            return "RROO";
        }
        else if(time.getHours() == 3 || time.getHours() == 8 || time.getHours() == 13 || time.getHours() == 18 || time.getHours() == 23) {
            return "RRRO";
        }
        else if(time.getHours() == 4 || time.getHours() == 9 || time.getHours() == 14 || time.getHours() == 19 || time.getHours() == 24) {
            return "RRRR";
        }
        else return "OOOO";
    }
}
