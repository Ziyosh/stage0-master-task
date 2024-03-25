package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {


        if (year > 0 && month >= 1 && month <= 12) {
            switch (month) {
                case 5:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                case 1:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        System.out.println("29");
                    } else {
                        System.out.println("28");
                    }
                    break;
            }
        }else {
            System.out.println("invalid date");
        }
    }

    public boolean isLeapYear(int year) {
        if(year%4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }else {
            return false;
        }
    }
}
