package com.ming.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cgm
 * @date 2017/12/8.
 */
@RestController
@EnableAutoConfiguration
@ComponentScan({"com.ming.boot"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("start");
        System.out.println(System.getProperties());
        System.getProperties();
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
