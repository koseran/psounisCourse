package com.example.psouniscourse.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PiesController {



    @GetMapping(path="/pies")
    public String handleRewuest(){return "pies";}

}
