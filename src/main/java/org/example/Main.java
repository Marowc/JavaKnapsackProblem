package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of items:");
        int number = scanner.nextInt();
        System.out.println("Enter seed:");
        int seed = scanner.nextInt();
        System.out.println("Enter capacity:");
        int capacity = scanner.nextInt();

        int lowerBound = 1;
        int upperBound = 10;

        Problem problem = new Problem(number, seed, lowerBound, upperBound);
        System.out.println(problem);

        Result result = problem.Solve(capacity);
        System.out.println(result);
        System.out.println("weight: " + result.getOccupied() + " value: " + result.getValue());

    }
}