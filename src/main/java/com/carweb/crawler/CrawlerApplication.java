package com.carweb.crawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.lang.management.ManagementFactory;

@SpringBootApplication
public class CrawlerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(CrawlerApplication.class, args);
        System.out.println("hi");
        //Test.shell();

        while(true) {
            Thread.sleep(30000);
            Test.test();
            System.out.println("hi2");
            System.out.println("hi3");

        }

    }

}
