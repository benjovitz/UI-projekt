package com.example.uiprojekt.service;

public class Picture {

    public String pictureChange(String path){
        String[] array = path.split("_");
        int i = Integer.parseInt(array[1]) + 1;
        String s = array[0]+i;
        return s;
    }
}
