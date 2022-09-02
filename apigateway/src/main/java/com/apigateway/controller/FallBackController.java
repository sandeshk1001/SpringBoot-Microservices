package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        return "user service is down at this time";
    }

    @GetMapping("/contactServiceFallBack")
    public String contactServiceFallBack(){
        return "contact service is down at this time";
    }

    @GetMapping("/eServerServiceFallBack")
    public String eSercerServiceFallBack(){
        return "Eureco server service is down at this time";
    }

}
