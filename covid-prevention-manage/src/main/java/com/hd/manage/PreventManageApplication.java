package com.hd.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fqs
 * @Decription
 * @since 2023/1/30
 */
@SpringBootApplication(scanBasePackages = {"com.hd"})
@EnableDiscoveryClient
public class PreventManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(PreventManageApplication.class,args);
    }
}
