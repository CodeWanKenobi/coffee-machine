package com.github.codewankenobi;

import java.util.HashMap;
import java.util.Map;

class CoffeeMachine {

    private Map<String, Recipe> makersMap = new HashMap<>();

    String processRequest(String request) {
        if (makersMap.containsKey(request)) {
            return makersMap.get(request).make().composeResponse();
        } else {
            throw new RuntimeException("Wrong request");
        }
    }

    Map<String, Recipe> getMakersMap() {
        return makersMap;
    }

    void setMakersMap(Map<String, Recipe> makersMap) {
        this.makersMap = makersMap;
    }
}
