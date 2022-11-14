package com.github.codewankenobi;

class LatteMaker extends AbstractMaker {


    @Override
    public Cup make() {
        Cup cup = takeNewEmptyCup();
        cup.add("espresso");
        cup.add("milk");
        cup.add("milk");
        cup.add("foam");
        return cup;
    }
}
