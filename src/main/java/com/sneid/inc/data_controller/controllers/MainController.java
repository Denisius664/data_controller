package com.sneid.inc.data_controller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main(@RequestParam(name="name", required=false, defaultValue="wrld") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }

}
