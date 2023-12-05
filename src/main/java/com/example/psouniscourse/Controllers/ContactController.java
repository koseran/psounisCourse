package com.example.psouniscourse.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {


    @GetMapping(path = "/contact")
    public String handleRewuest() {
        return "contact";
    }

}
