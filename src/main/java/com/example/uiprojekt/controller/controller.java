package com.example.uiprojekt.controller;

import com.example.uiprojekt.service.UIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class controller {

    UIService uiService = new UIService();

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

    @PostMapping("/frontpage-co2")
    public String co2FrontPost(@RequestParam("madvare") String food, @RequestParam("kg") Integer kg, RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("madvare", food);
        redirectAttributes.addAttribute("kg", kg);
        return "redirect:/frontpage-co2";
    }

    @GetMapping("/frontpage-co2")
    public String co2Front(@RequestParam("madvare") String food, @RequestParam("kg") Integer kg, Model model) {
        model.addAttribute("madvare", food);
        model.addAttribute("kg", kg);
        double co2 = uiService.calculateCO2(food,kg);
        model.addAttribute("co2", co2);
        return "frontpage-co2";
    }
}


