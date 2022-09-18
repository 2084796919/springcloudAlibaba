package com.luguz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Guz
 * @create 2022-09--18 19:55
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class comsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(comsumerApplication.class, args);
    }
}
