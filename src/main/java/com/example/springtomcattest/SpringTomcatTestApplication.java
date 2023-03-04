package com.example.springtomcattest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringTomcatTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTomcatTestApplication.class, args);
    }


    @RestController
    @RequestMapping("hello")
    public static class TestController {

        @GetMapping
        public String getHello() {
            return "Hello";
        }
    }
}
