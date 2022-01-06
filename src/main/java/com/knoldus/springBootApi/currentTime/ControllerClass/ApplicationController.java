package com.knoldus.springBootApi.currentTime.ControllerClass;


import com.knoldus.springBootApi.currentTime.ServiceClass.ApplicationServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* Represents a controller class of 1-api  Application.
*/
@RestController
public class ApplicationController {
    /**
    * inserting ApplicationServices object
    */
    @Autowired
    ApplicationServices appService;

    //  mapping request to  method
    @RequestMapping("/status")
    public String getTimeStatus(){


        return appService.getTimeStatus();
    }
}
