package org.example.day1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Day1 {
    public static void run() {
        areaOfRectangle(10, 3);
        circleDetails(5);
        calcAngleOfTriangle(90, 60);
        dateDiff("2024-03-19", "2024-03-21");
        getInitials("Gora Asep Setiana");
    }

    static void areaOfRectangle(double l, double w) {
        System.out.println("Area of rectangle = " + (l * w));
        System.out.println("==========");
    }

    static void circleDetails(double r) {
        double diameter = 2 * r;
        double circumference = 2 * 3.14 * r;
        double area = 3.14 * r * r;
        System.out.println("Circle details:");
        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
        System.out.println("==========");
    }

    static void calcAngleOfTriangle(double d1, double d2) {
        double thirdAngle = 180 - (d1 + d2);
        System.out.println("Third angle = " + thirdAngle);
        System.out.println("==========");
    }

    static void dateDiff(String date1, String date2) {
        LocalDate parsedDate1 = LocalDate.parse(date1);
        LocalDate parsedDate2 = LocalDate.parse(date2);
        long diff = ChronoUnit.DAYS.between(parsedDate1, parsedDate2);
        System.out.println("Days difference = " + diff);
        System.out.println("==========");
    }

    static void getInitials(String name) {
        String[] initials = name.split(" ");
        System.out.print("Initials = ");
        for (String i : initials) {
            System.out.print(i.toUpperCase().charAt(0));
        }
        System.out.println("\n==========");
    }
}
