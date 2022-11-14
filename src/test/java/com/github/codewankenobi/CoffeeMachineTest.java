package com.github.codewankenobi;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CoffeeMachineTest {

    private final CoffeeMachine coffeeMachine = new CoffeeMachine();

    @Before
    public void setUp() {
        Map<String, Recipe> makersMap = new HashMap<>();
        makersMap.put("AMERICANO", new AmericanoMaker());
        makersMap.put("ESPRESSO", new EspressoMaker());
        makersMap.put("LATTE", new LatteMaker());
        makersMap.put("CAPPUCCINO", new CappuccinoMaker());
        makersMap.put("MOCACCINO", new MocaccinoMaker());
        makersMap.put("ESPRESSOCONPANNA", new EspressoConPannaMaker());
        coffeeMachine.setMakersMap(makersMap);
    }

    @Test
    public void shouldGetAmericanoRecipe() {
        String response = coffeeMachine.processRequest("AMERICANO");
        assertEquals("{ \"espresso\": 1, \"water\": 1, \"milk\": 0, \"foam\": 0 }", response);
    }

    @Test
    public void shouldGetEspressoRecipe() {
        String response = coffeeMachine.processRequest("ESPRESSO");
        assertEquals("{ \"espresso\": 1, \"water\": 0, \"milk\": 0, \"foam\": 0 }", response);
    }

    @Test
    public void shouldGetLatteRecipe() {
        String response = coffeeMachine.processRequest("LATTE");
        assertEquals("{ \"espresso\": 1, \"water\": 0, \"milk\": 2, \"foam\": 1 }", response);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenRecipeIsUnknown() {
        coffeeMachine.processRequest("TEA");
    }

    @Test
    public void shouldGetCappuccinoRecipe() {
        String response = coffeeMachine.processRequest("CAPPUCCINO");
        assertEquals("{ \"espresso\": 1, \"water\": 0, \"milk\": 1, \"foam\": 1 }", response);
    }

    @Test
    public void shouldGetMocaccinoRecipe() {
        String response = coffeeMachine.processRequest("MOCACCINO");
        assertEquals("{ \"espresso\": 1, \"water\": 0, \"milk\": 2, \"foam\": 1, \"chocolate\": 1 }", response);
    }

    @Test
    public void shouldGetEspressoConPannaRecipe() {
        String response = coffeeMachine.processRequest("ESPRESSOCONPANNA");
        assertEquals("{ \"espresso\": 1, \"water\": 1, \"milk\": 0, \"foam\": 0, \"cream\": 1 }", response);
    }
}
