package com.luguz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Guz
 * @create 2022-09--18 16:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class, args);
    }
}
