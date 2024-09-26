package com.pluralsight;

public class Demo1 {

    public static void main(String[] args){
        System.out.println("HelloWorld");

        char status = 'y';
        int identifier = 1;
        String name = "Ylandre";


        String greeting ="Hello " + name;
        //String greeting = "Hello " + "Ylandre";
         //String greeting = "Hello Ylandre";

        int numberofDaysPerWeekWatchesTV = 5;
        int minutesPerDayOnDayWatchedOnAverage = 90;

        int minutesPerWeek = numberofDaysPerWeekWatchesTV * minutesPerDayOnDayWatchedOnAverage;
        int minutesPerYear = minutesPerWeek * 52;

        int hoursPerYear = minutesPerYear / 60;

        int hoursInWorkWeek = 30;

        int workWeeksPerYearWatchingTV = hoursPerYear / hoursInWorkWeek;

        int workWeeksPerYearWatchingTV2 = (5 * 90 * 52 / 60) /30;


        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV + " week vacation every year");
        System.out.println("If " + name + " did not watvh TV, it would be like a " + workWeeksPerYearWatchingTV2 + " week vacation every year");


      System.out.println (greeting);
    }
}

