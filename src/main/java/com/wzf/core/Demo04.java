package com.wzf.core;

import java.time.LocalDate;

/**
 * @author w1563
 */
public class Demo04 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();

        LocalDate date2 = LocalDate.of(2020, 2, 26);

        if (date1.equals(date2)) {
            System.out.println("时间相等");
        } else {
            System.out.println("时间不等");
        }

    }
}
