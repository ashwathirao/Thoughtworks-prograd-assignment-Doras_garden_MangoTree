package com.Thoughtworks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> hoursPerDay=new ArrayList<Integer>(7);
        SalaryAndBonusCalculator Sb=new SalaryAndBonusCalculator();

        int salary=0;
        int payPerHours=100,saturdayBonus=25,sundayBonus=50,dailyBonus=15;
        int totalHoursPerWeek=0,maxHoursPerDay=8,maxHoursPerWeek=40;

        // initializing variables with constant values of pay per day and bonus percentage
        // so that can be updated in future.
        // usage of ArrayList without Limits can enable to calculate salary for multiple weeks
        //on a single go

        for(int index = 0; index<7; index++)
        {
            hoursPerDay.add(sc.nextInt());
            totalHoursPerWeek+=hoursPerDay.get(index);

            if(index==6)
                salary+=Sb.calculateBonus(hoursPerDay.get(index),saturdayBonus,payPerHours);
            else if(index==0)
                salary+=Sb.calculateBonus(hoursPerDay.get(index),sundayBonus,payPerHours);

            salary+=Sb.calculateSalary(hoursPerDay.get(index),payPerHours);
            salary+=Sb.calculateOvertimeBonus(hoursPerDay.get(index),maxHoursPerDay,dailyBonus);
        }
        salary+=Sb.calculateOvertimeBonus(totalHoursPerWeek,maxHoursPerWeek,dailyBonus);
        System.out.println(salary);

    }
}
