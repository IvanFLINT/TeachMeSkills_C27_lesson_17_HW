package com.teachmeskills.lesson17.task2.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In the DayOfTheWeek class, the whatDay method uses the SimpleDateFormat class to format the date.
 */
public class DayOfTheWeek {
    public static void whatDay() {
        SimpleDateFormat day = new SimpleDateFormat("F EEEE");
        String result = day.format(new Date());
        System.out.println(result + " в этом месяце");
    }
}
