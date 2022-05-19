package com.JavaSandbox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {
    
    public MainController(){} 

    @GetMapping("/")
    public String loadTable(Model model){
        String data[][] = {
            {"Row 11", "Row 12", "Row 13", "Row 14", "Row 15"},
            {"Row 21", "Row 22", "Row 23", "Row 24", "Row 25"},
            {"Row 31", "Row 32", "Row 33", "Row 34", "Row 35"},
            {"Row 41", "Row 42", "Row 43", "Row 44", "Row 45"},
            {"Row 51", "Row 52", "Row 53", "Row 54", "Row 55"},
            {"Row 61", "Row 62", "Row 63", "Row 64", "Row 65"},
            {"Row 71", "Row 72", "Row 73", "Row 74", "Row 75"},
            {"Row 81", "Row 82", "Row 83", "Row 84", "Row 85"},
            {"Row 91", "Row 92", "Row 93", "Row 94", "Row 95"},
            {"Row 101", "Row 102", "Row 103", "Row 104", "Row 105"},
        };

        model.addAttribute("data", data);
        return "index";
    }

    @PostMapping(value="/on-table-click")
    public String onTableClick(@RequestBody int index) {
        
        System.out.println("index: " + index);
        return "index";
    }
}