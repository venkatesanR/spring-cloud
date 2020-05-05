package com.techmania.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudServer {
    public static void main(String[] args) {
        SpringApplication.run(CloudServer.class, args);
    }
}
