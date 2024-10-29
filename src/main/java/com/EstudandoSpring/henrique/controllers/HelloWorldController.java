package com.EstudandoSpring.henrique.controllers;

import com.EstudandoSpring.henrique.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldController {

    private static String greeting = "Hello %s!";
    private AtomicLong id = new AtomicLong();

    @RequestMapping("/greeting")
    public HelloWorld greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new HelloWorld(id.getAndIncrement(), String.format(greeting, name));
    }
}
