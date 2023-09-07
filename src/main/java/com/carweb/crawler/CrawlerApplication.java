package com.carweb.crawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.lang.management.ManagementFactory;


@EnableScheduling
@SpringBootApplication
public class CrawlerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(CrawlerApplication.class, args);


    }

}
