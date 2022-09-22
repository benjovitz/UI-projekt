package com.example.uiprojekt.service;

import java.util.HashMap;

public class UIService {

  private HashMap<String, Double> foodMap;

  public UIService() {
    foodMap = new HashMap<>();
    foodMap.put("Oksekød", 19.4);
    foodMap.put("Svinekød", 3.6);
    foodMap.put("Kyllingekød", 3.1);
    foodMap.put("Fisk", 2.0);
    foodMap.put("Skalddyr", 8.5);
    foodMap.put("Banan", 0.5);
    foodMap.put("Æble", 0.3);
    foodMap.put("Agurk", 0.2);
    foodMap.put("Mælk", 1.2);
    foodMap.put("Øl", 1.0);
    foodMap.put("Kaffe", 0.2);
  }

  public HashMap<String, Double> getFoodMap() {
    return foodMap;
  }

  public double calculateCO2(String food, int kg){
    double co2 = foodMap.get(food);
    return co2 * kg;
  }
}
