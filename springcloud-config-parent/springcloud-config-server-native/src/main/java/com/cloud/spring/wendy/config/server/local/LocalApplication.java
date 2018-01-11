package com.cloud.spring.wendy.config.server.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2018/1/11.
 */
@SpringBootApplication
@EnableConfigServer
public class LocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalApplication.class,args);
    }

}
