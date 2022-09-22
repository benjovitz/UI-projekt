package com.example.uiprojekt.controller;

import com.example.uiprojekt.service.Picture;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
    private int x=0;

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
    @PostMapping("/merchtest")
    public String merchTest(){
        return "redirect:merchtest";
    }

    @GetMapping("/merchtest")
    public String createMerchTestSite(Model model) {
        String path = "images/tshirt_";
        x++;
        model.addAttribute("picture",path+x);
        return "merchtest";
    }
}


