package br.com.dml.controllers;


import br.com.dml.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "First - Hello , %s!";

    private final AtomicLong counter = new AtomicLong();
    // http://localhost:8080/greeting?name=Danilo
    @RequestMapping("/greeting")
    public Greeting  greenting(
            @RequestParam(value = "name", defaultValue = "Word")
            String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
