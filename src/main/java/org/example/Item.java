package org.example;

public class Item {
    private int value;
    private int weight;
    private int index;


    public Item(){
        this.value = 0;
        this.weight = 0;
        this.index = 0;
    }

    public Item(int value, int weight, int index) {
        this.value = value;
        this.weight = weight;
        this.index = index;
    }

    public double getRatio(){
        return this.value / this.weight;
    }

    public int getWeight() {
        return weight;
    }
    public int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return index + ": value: " + value + ", weight: " + weight;
    }
}

class ItemComparator implements java.util.Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        double ratio1 = item1.getRatio();
        double ratio2 = item2.getRatio();

        if (ratio1 > ratio2) {return -1;}
        else if (ratio1 < ratio2) {return 1;}
        else {return 0;}
    }
}
