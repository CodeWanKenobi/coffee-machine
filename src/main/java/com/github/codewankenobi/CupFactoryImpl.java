package com.github.codewankenobi;

import java.util.Arrays;

class CupFactoryImpl implements CupFactory {

    @Override
    public Cup getCup() {
        Cup cup = new Cup();
        cup.setZeroIngredients(Arrays.asList("espresso", "water", "milk", "foam"));
        return cup;
    }
}
