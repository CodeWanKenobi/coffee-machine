package com.github.codewankenobi;

class EspressoMaker extends AbstractMaker {


    @Override
    public Cup make() {
        Cup cup = takeNewEmptyCup();
        cup.add("espresso");
        return cup;
    }
}
