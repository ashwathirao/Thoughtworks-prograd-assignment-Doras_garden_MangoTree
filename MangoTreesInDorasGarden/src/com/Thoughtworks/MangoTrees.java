package com.Thoughtworks;
// created a class so that future improvements can be made easy and doesn't disturb the main class
public class MangoTrees {
    int garden_length,garden_breadth;
    MangoTrees(int garden_length,int garden_breadth)
    {
        this.garden_length=garden_length;
        this.garden_breadth=garden_breadth;
    }
    public boolean find_mango_tree(int tree_number)
    {
        if(tree_number<garden_length || tree_number%garden_length==1 ||tree_number%garden_length==0)
            return true;
        return  false;
    }
    public boolean validate_tree_number(int tree_number)
    {
        if(tree_number<=garden_length*garden_breadth && tree_number>0)
            return  true;
        return  false;
    }
}
