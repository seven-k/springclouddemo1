package com.ycl.discovery.hiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiServerApplication.class, args);
    }
}
