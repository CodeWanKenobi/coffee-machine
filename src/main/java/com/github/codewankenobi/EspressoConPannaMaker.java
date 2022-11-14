package com.github.codewankenobi;

class EspressoConPannaMaker extends AbstractMaker {

    @Override
    public Cup make() {
        Cup cup = takeNewEmptyCup();
        cup.add("espresso");
        cup.add("water");
        cup.add("cream");
        return cup;
    }
}
