package org.example;
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Problem {
    private int number;
    private int seed;
    private int lowerBound;
    private int upperBound;
    private List<Item> items;

    public Problem(){
        this.number = 0;
        items = new ArrayList<Item>();
    }

    public Problem(int number, int seed, int lowerBound, int upperBound) {
        this.number = number;
        this.seed = seed;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;

        this.items = new ArrayList<>(number);

        Random random = new Random(seed);

        int randomValue;
        int randomWeight;

        for (int i = 0; i < number; i++) {
            randomValue = random.nextInt(upperBound - lowerBound) + lowerBound;
            randomWeight = random.nextInt(upperBound - lowerBound) + lowerBound;
            items.add(new Item(randomValue, randomWeight, i));
        }
    }

    public void addItem(Item item){
        items.add(item);
        number++;
    }

    public Item getItem(int index){
        return items.get(index);
    }

    public Result Solve(int capacity){
        Result result = new Result();
        List<Item> sortedList = this.items;

        Collections.sort(sortedList, new ItemComparator());

        for(Item item : sortedList){
            while(capacity >= result.getOccupied() + item.getWeight()){
                result.addItem(item);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        String string = "";
        for (Item item : this.items) {
            string += item.toString();
            string += "\n";
        }
        return string;
    }
}
