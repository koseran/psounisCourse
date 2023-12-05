package com.example.psouniscourse.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BuyController {

    @GetMapping(path="/buy")
    public String handleRewuest(){return "buy";}

}
