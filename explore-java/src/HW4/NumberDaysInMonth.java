package HW4;

import java.util.Scanner;

public class NumberDaysInMonth {
    public static void main(String[] args) {
        System.out.println("Enter year and month");
        int year, month;
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        month = input.nextInt();
        calculateDays(month, year);
        printYearAndAmountOfDays(month,year,calculateDays(month,year));
    }

    public static String calculateDays(int month, int year) {
        String monthName;
        switch (month) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> throw new IllegalStateException("Unexpected value: " + month);
        }return monthName;
    }


    public static boolean isVisokosnyyGod(int year) {
        int a;
        boolean result;
        double b = (year % 4) / 100;
        double c = (b % 100) / 400;

        if (year % 4 == 0) {
            if (b % 100 == 0) {
                if (c % 100 == 0) {
                    System.out.println("Visokosnyi God");
                    result = true;
                } else {
                    System.out.println("Ne Visokosnyi God");
                    result = false;
                }
            } else {
                System.out.println("Visokosnyi God");
                result = true;
            }

        } else {
            System.out.println("Ne Vysokosnyi God");
            result = false;
        }
        return result; // возвращает данные //
    }


    static void printYearAndAmountOfDays ( int month, int year, String monthName){
        int days;
        if (month == 2) {
            boolean isVisokosnyi;
            isVisokosnyi = isVisokosnyyGod(year); //получаем данные из метода isVisokosnyyGod //

            if (isVisokosnyi) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month % 2 == 0) {
            days = 30;
        } else {
            days = 31;
        }
        System.out.println(monthName + " " + year + " has " + days + " days");
    }
}
