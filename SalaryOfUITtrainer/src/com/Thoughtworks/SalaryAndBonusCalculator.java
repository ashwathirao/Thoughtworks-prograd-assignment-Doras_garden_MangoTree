package com.Thoughtworks;

public class SalaryAndBonusCalculator {
    public int calculateBonus(int hours,int bonusPercentage,int paymentPerHour)
    {
        return(hours*paymentPerHour*bonusPercentage)/100;
    }
    public int calculateOvertimeBonus(int hours,int maxHourLimit,int bonus)
    {
        if(hours>maxHourLimit)
            return (hours-maxHourLimit)*bonus;
        return 0;
    }
    public int calculateSalary(int hours,int paymentPerHour)
    {
        return hours*paymentPerHour;
    }
}
