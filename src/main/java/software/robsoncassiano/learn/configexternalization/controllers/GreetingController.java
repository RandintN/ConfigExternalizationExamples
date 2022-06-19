package software.robsoncassiano.learn.configexternalization.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${welcome.greeting}")
    private String greetingSalutation;

    @GetMapping(path = "/from-value")
    public String fromValue() {
        return greetingSalutation;
    }
}
