package co.edu.uptc.ejemplo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message")
    public void message() {
        
        System.out.println("MessageController.message");
    }
}
