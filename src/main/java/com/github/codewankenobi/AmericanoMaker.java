package com.github.codewankenobi;

class AmericanoMaker extends AbstractMaker {

    @Override
    public Cup make() {
        Cup cup = takeNewEmptyCup();
        cup.add("espresso");
        cup.add("water");
        return cup;
    }
}
