package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    @RequestMapping("/")
    public String home() {
      return "CVE-2021-44228 demonstration. Please use this sample carefully";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
