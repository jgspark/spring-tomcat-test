package com.example.springtomcattest;

import lombok.extern.slf4j.Slf4j;
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


    @Slf4j
    @RestController
    @RequestMapping("hello")
    public static class TestController {

        @GetMapping
        public String getHello() throws InterruptedException {
            log.info("working...");
            log.info("thread name is {}" , Thread.currentThread().toString());
            Thread.sleep(5000);
            return "Hello";
        }
    }
}
