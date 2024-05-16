package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Result {
    List<Item> items;
    int occupied;
    int value;

    public Result(){
        this.items = new ArrayList<Item>();
        this.occupied = 0;
        this.value = 0;
    }

    public Result(List<Item> items){
        this.items = items;
        for(Item item : this.items){
            this.occupied += item.getWeight();
            this.value += item.getValue();
        }
    }

    public void addItem(Item item){
        this.items.add(item);
        this.occupied+=item.getWeight();
        this.value+=item.getValue();
    }

    public int getOccupied(){
        return this.occupied;
    }

    public int getValue(){
        return this.value;
    }

    public int getNumberOfItems(){
        return this.items.size();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(items, result.items);
    }
}
