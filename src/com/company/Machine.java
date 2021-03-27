package com.company;

import com.company.products.Food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Machine
{
    private Helper helper;
    private HashMap<FoodType, ArrayList<Queue<Food>>> table;

    public Machine() {
        helper = new Helper();
        table = helper.getTable();
    }

    public ArrayList<Food> getProduct(Command command) {
        ArrayList<Food> arr = new ArrayList<Food>();
        //System.out.println(table.get(command.getFoodType()).get(command.getColumn()).size());
        for(int i=0;i<command.getCount();i++)
        {
            arr.add(((LinkedList<Food>)(table.get(command.getFoodType()).get(command.getColumn()-1))).getFirst());
            ((LinkedList<Food>)(table.get(command.getFoodType()).get(command.getColumn()-1))).removeFirst();
        }
        //System.out.println(table.get(command.getFoodType()).get(command.getColumn()).size());
        return arr;
    }

}
