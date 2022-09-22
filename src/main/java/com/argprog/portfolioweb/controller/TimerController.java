
package com.argprog.portfolioweb.controller;

import java.time.Instant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0")
public class TimerController {
    @CrossOrigin(origins = "https://portfolioweb-frontend.web.app")
    @GetMapping("/time")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime(){
        
        return Instant.now().toString();
    }
}
