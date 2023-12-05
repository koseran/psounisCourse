package com.example.psouniscourse.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/store")
public class StroeController {
    @GetMapping
    public String handeRequest(){
    return "store";
    }
}
