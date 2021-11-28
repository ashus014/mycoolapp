package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){

        return "Hello Ashu! Time on the server is : " + LocalDateTime.now();
    }

    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){

        return "Run hard 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){

        return "Today is your lucky day";
    }
}
