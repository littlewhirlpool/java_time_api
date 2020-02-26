package com.wzf.core;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * @author w1563
 */
public class Demo05 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2018, 2, 25);

        MonthDay currentMonthDay = MonthDay.from(date1);

        // 或者 MonthDay birthday = MonthDay.of(date2.getMonth(),date2.getDayOfMonth());
        MonthDay birthday = MonthDay.from(date2);


        if (currentMonthDay.equals(birthday)) {
            System.out.println("是你的生日");
        } else {
            System.out.println("你的生日还没有到");
        }

    }
}
