package com.Thoughtworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length_of_rectangular_doras_garden=sc.nextInt(); // columns of the rectangular garden
        int breadth_of_rectangular_doras_garden=sc.nextInt(); // rows of the rectangular garden
        int tree_number=sc.nextInt(); // tree number should range from zero
        MangoTrees mangoTrees=new MangoTrees(length_of_rectangular_doras_garden,breadth_of_rectangular_doras_garden);
        System.out.println(mangoTrees.validate_tree_number(tree_number)?(mangoTrees.find_mango_tree(tree_number)?"The given tree number represents a Mango tree":"The given tree number doesn't represents a Mango tree"):("Invalid Tree Number"));

    }
}
