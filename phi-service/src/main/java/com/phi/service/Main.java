package com.phi.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScanls
@EnableAutoConfiguration
public class Main {

    public static void main(String[] args)  {

        SpringApplication.run(Main.class, args);
    }
}