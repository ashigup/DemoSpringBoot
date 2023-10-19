package com.example.demo.hello;

import com.example.demo.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingV2Controller {
    @GetMapping("/greetingV2")
    public Greeting greeting(){
        return new Greeting(2,"Ashish");
    }
}
