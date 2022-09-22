package com.example.uiprojekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class controller {

    private ArrayList<String> list;

    public controller(){
        list = new ArrayList<>();

        list.add("white.png");
        list.add("black.png");
    }

    @GetMapping("/")
    public String frontPage(){
        return "merch";
    }

}


