package com.Thoughtworks;

import java.util.Scanner;

public class Main {
    static boolean oddnum=false,evennum=false;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arraylength=sc.nextInt();
        int []array=new int[arraylength];
        String[] arrayType={"Even","Odd","Mixed"};
        for(int index=0;index<arraylength;index++)
        {
            array[index]=(sc.nextInt());
            if(array[index]%2==0)
                evennum=true;
            else
                oddnum=true;
        }
        System.out.println("The array is "+arrayType[checkArrayType()-1]);
    }
    public static int checkArrayType(){
        if(oddnum && evennum)
            return 3;
        return oddnum?2:1;
    }
}
