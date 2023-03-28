package com.tul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //เรียกใช้งาน spring boot
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); //เปิดใช้งาน spring boot
//        System.out.println("Hello");
    }
    @GetMapping("/")
    public String greet() {
        return "Hello";
    }
}
