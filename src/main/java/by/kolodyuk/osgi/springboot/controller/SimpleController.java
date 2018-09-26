package by.kolodyuk.osgi.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/echo")
    public String echo() {
        return "echo";
    }

}
