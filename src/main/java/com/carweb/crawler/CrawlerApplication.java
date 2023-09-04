package com.carweb.crawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CrawlerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(CrawlerApplication.class, args);
        System.out.println("hi");
        Test.shell();
        Test.test();

    }

}
