package com.company;


import com.company.products.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Helper {

    private HashMap<FoodType, ArrayList<Queue<Food>>> table;

    public Helper(){
        table = new HashMap<FoodType, ArrayList<Queue<Food>>>();
        ArrayList<Queue<Food>> linkedLists;

        linkedLists = new ArrayList<>();
        linkedLists.add(new LinkedList<Food>());
        for(int i=0;i<20;i++)
            linkedLists.get(linkedLists.size()-1).add(new CocaCola());
        linkedLists.add(new LinkedList<Food>());
        for(int i=0;i<20;i++)
            linkedLists.get(linkedLists.size()-1).add(new Sprite());
        linkedLists.add(new LinkedList<Food>());
        for(int i=0;i<20;i++)
            linkedLists.get(linkedLists.size()-1).add(new Fanta());
        table.put(FoodType.DRINKS, linkedLists);

        linkedLists = new ArrayList<>();
        linkedLists.add(new LinkedList<Food>());
        for(int i=0;i<20;i++)
            linkedLists.get(linkedLists.size()-1).add(new Lays());
        linkedLists.add(new LinkedList<Food>());
        for(int i=0;i<20;i++)
            linkedLists.get(linkedLists.size()-1).add(new Doritos());
        linkedLists.add(new LinkedList<Food>());
        for(int i=0;i<20;i++)
            linkedLists.get(linkedLists.size()-1).add(new Pringles());
        table.put(FoodType.CHIPS, linkedLists);

        linkedLists = new ArrayList<>();
        linkedLists.add(new LinkedList<Food>());
        for(int i=0;i<20;i++)
            linkedLists.get(linkedLists.size()-1).add(new Snickers());
        linkedLists.add(new LinkedList<Food>());
        for(int i=0;i<20;i++)
            linkedLists.get(linkedLists.size()-1).add(new Mars());
        linkedLists.add(new LinkedList<Food>());
        for(int i=0;i<20;i++)
            linkedLists.get(linkedLists.size()-1).add(new Twix());
        table.put(FoodType.CHOCOLATE, linkedLists);
    }

    public HashMap<FoodType, ArrayList<Queue<Food>>> getTable() {
        return table;
    }
}
