package com.example.uiprojekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String frontPage(){
        return "frontpage";
    }

    @GetMapping("/home")
    public String homeFrontPage(){
        return "frontpage";
    }

    @PostMapping("/home")
    public String createFrontPage() {
        return "frontpage";
    }

    @PostMapping("/merch")
    public String merch(){
        return "merch";
    }

    @GetMapping("/merch")
    public String createMerchSite() {
        return "merch";
    }

    @PostMapping("/tricks")
    public String tricks(){
        return "tricks";
    }

    @GetMapping("/tricks")
    public String createTricksSite() {
        return "tricks";
    }
}


