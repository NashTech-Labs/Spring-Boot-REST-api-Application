package com.knoldus.springBootApi.currentTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Application uesd to give current time status
 */
@SpringBootApplication
public class CurrentTimeApplication {
	/**
     	* main method called
	* @param args its take arguments
     	*/
	public static void main(String[] args) {
		SpringApplication.run(CurrentTimeApplication.class, args);
	}

}
