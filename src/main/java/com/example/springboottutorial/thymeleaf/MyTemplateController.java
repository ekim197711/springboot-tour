package com.example.springboottutorial.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyTemplateController {
    @GetMapping("/businesscard")
    public String businessCard(Model model) {
        model.addAttribute("name", "Mike");
        model.addAttribute("age", "43");
        model.addAttribute("favouritecolor", "Black");
        return "mybusinesscard";
    }
}
