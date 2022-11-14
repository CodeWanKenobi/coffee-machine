package com.github.codewankenobi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setMakersMap(setUp());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coffee you want: ");
        String userInput = scanner.nextLine();

        try {
            System.out.println(coffeeMachine.processRequest(userInput.toUpperCase()));
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
    
    private static Map<String, Recipe> setUp() {
        Map<String, Recipe> makersMap = new HashMap<>();

        makersMap.put("AMERICANO", new AmericanoMaker());
        makersMap.put("ESPRESSO", new EspressoMaker());
        makersMap.put("LATTE", new LatteMaker());
        makersMap.put("CAPPUCCINO", new CappuccinoMaker());
        makersMap.put("MOCACCINO", new MocaccinoMaker());

        return makersMap;
    } 
}