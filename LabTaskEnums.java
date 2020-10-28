package LabTaskEnums;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Locale;
public enum Months {
    JANUARY(31),
    FEBRUARY(29),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private final int numberOfDays;

    Months(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}

class Calender {
    public static void main(String[] args) {
        int currentDate  = new GregorianCalendar().get(Calendar.DATE);
        String currentMonth = new GregorianCalendar().getDisplayName(
             Calendar.MONTH,
             Calendar.LONG,
             Locale.US
        );
        System.out.println("Current month is " + currentMonth + ", and the date is " + currentDate + ".");
        Months month = Months.valueOf(currentMonth.toUpperCase());
        int leftDaysOfMonth;
        switch (month){
            case JANUARY:
            leftDaysOfMonth = Months.JANUARY.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case FEBRUARY:
                leftDaysOfMonth = Months.FEBRUARY.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case MARCH:
                leftDaysOfMonth = Months.MARCH.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case APRIL:
                leftDaysOfMonth = Months.APRIL.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case MAY:
                leftDaysOfMonth = Months.MAY.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case JUNE:
                leftDaysOfMonth = Months.JUNE.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case JULY:
                leftDaysOfMonth = Months.JULY.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case AUGUST:
                leftDaysOfMonth = Months.AUGUST.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case SEPTEMBER:
                leftDaysOfMonth = Months.SEPTEMBER.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case OCTOBER:
                leftDaysOfMonth = Months.OCTOBER.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case NOVEMBER:
                leftDaysOfMonth = Months.NOVEMBER.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
            case DECEMBER:
                leftDaysOfMonth = Months.DECEMBER.getNumberOfDays() - currentDate;
                System.out.println(leftDaysOfMonth + " Days left in " + currentMonth + "!");
                break;
        }

    }
}
