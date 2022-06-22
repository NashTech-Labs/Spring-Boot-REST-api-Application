package com.knoldus.springBootApi.currentTime.controller;

import com.knoldus.springBootApi.currentTime.service.CurrentDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* Represents a CurrentTimeController class of 1-api  Application.
 * Created by IntelliJ IDEA.
 * Project : spring-boot-REST-api-example
 * User: shashikant
 * Date: 22/06/2022
*/
@RestController
public class CurrentTimeController {

    @Autowired
    CurrentDateTime appService;

    @RequestMapping("/status")
    public String getTimeStatus(){


        return appService.getTimeStatus();
    }
}
