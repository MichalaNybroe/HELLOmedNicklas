package com.example.springdemo.services;

import java.util.Calendar;

public class CalculateDayOfWeek {

    public static String calc() {
        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.FRIDAY) {
            return "It's FRIDAY!!!";
        } else{
            return "So sorry, it is not friday today :(";
        }
    }
}
