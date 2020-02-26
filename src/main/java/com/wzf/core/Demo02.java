package com.wzf.core;

import java.time.LocalDate;

/**
 * @author w1563
 */
public class Demo02 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.println("year:" + year);
        System.out.println("month:" + month);
        System.out.println("day:" + day);

    }
}
