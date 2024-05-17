package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    @Test
    public void atLeastOneItemReturned() {
        Item item = new Item(1,1,0);
        Problem problem = new Problem();
        problem.addItem(item);
        Result result = problem.Solve(1);
        assertEquals(1,result.getNumberOfItems());
    }

    @Test
    public void noneItemReturned() {
        Item item = new Item(1,5,0);
        Problem problem = new Problem();
        problem.addItem(item);
        Result result = problem.Solve(1);
        assertEquals(0,result.getNumberOfItems());
    }

    @Test
    public void arePropertiesInTheCorrectRange(){
        int number = 50;
        int lowerBound = 1;
        int upperBound = 10;
        Problem problem = new Problem(number,1,lowerBound,upperBound);
        Item item = new Item();
        for(int i = 0; i < number; i++){
            item = problem.getItem(i);
            assertTrue(item.getValue()>=lowerBound && item.getValue()<upperBound);
            assertTrue(item.getValue()>=lowerBound && item.getValue()<upperBound);
        }
    }

    @Test
    public void isResultCorrect(){
        List<Integer> capacity = new ArrayList<>(List.of(5,10,15));

        List<Item> instance = new ArrayList<Item>(4);
        instance.add(new Item(6,2,0));
        instance.add(new Item(2,4,1));
        instance.add(new Item(8,4,2));
        instance.add(new Item(1,1,3));

        Problem problem = new Problem();
        for(Item item : instance){ problem.addItem(item); }

        List<Item> result1 = new ArrayList<Item>(3);
        for(int i = 0; i < 2; i++){ result1.add(instance.get(0)); }
        result1.add(instance.get(3));

        List<Item> result2 = new ArrayList<Item>(3);
        for(int i = 0; i < 5; i++){ result2.add(instance.get(0)); }

        List<Item> result3 = new ArrayList<Item>(3);
        for(int i = 0; i < 7; i++){ result3.add(instance.get(0)); }
        result3.add(instance.get(3));

        List<Result> results = new ArrayList<Result>(3);
        results.add(new Result(result1));
        results.add(new Result(result2));
        results.add(new Result(result3));

        int i = 0;
        for(int cap : capacity){
            assertEquals(results.get(i++), problem.Solve(cap));
        }

    }

}