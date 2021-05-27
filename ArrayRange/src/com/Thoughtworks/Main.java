package com.Thoughtworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int minvalue,maxvalue,arraylength=sc.nextInt();
	int[] array=new int[arraylength];
	array[0]=minvalue=maxvalue=sc.nextInt();
	for(int index=1;index<arraylength;index++)
    {
        array[index]=sc.nextInt();
        maxvalue=array[index]>maxvalue?array[index]:maxvalue;
        minvalue=array[index]<minvalue?array[index]:minvalue;
    }
    System.out.println("The range of the array is "+(maxvalue-minvalue));
    }
}
