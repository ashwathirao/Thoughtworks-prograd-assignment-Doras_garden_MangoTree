package com.Thoughtworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),n=num;
        System.out.println(num);
        while(n!=1)
        {
            n=(n%2==0)?n/2:n*3+1;
            System.out.println(n);
        }
        System.out.println(num);
    }
}
