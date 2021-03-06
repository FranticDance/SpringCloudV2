package com.lpy.springcloudv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lpy
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentAppAlibaba9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAppAlibaba9001.class, args);
    }
}
