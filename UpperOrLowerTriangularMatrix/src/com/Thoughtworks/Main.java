package com.Thoughtworks;

import java.util.Scanner;

public class Main {

    static int array[][];
    static int row,column;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();column=sc.nextInt();
        array=new int[row][column];

        if(row!=column)
        {
            System.out.println("NO");
            System.exit(0);
        }

        for(int rowind=0;rowind<row;rowind++)
        {
            for(int colind=0;colind<column;colind++)
            {
                array[rowind][colind]=sc.nextInt();
            }
        }
        System.out.println(upperOrLowerTriangularMatrix(0,0,"upper")?"YES":"NO");
        System.out.println(upperOrLowerTriangularMatrix(1,column,"lower")?"YES":"NO");

    }
    public static boolean upperOrLowerTriangularMatrix(int stind,int endind,String type)
    {
        for(int rowind=0;rowind<row;rowind++)
        {
            for(int colind=stind;colind<endind;colind++)
                if (array[rowind][colind] != 0)
                    return false;
            if(type.equals("upper"))
                endind+=1;
            else
                stind+=1;
        }
        return true;
    }
}
