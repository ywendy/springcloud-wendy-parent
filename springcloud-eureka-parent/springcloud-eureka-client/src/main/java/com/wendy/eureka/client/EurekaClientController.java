package com.wendy.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/1/16.
 */
@RestController
public class EurekaClientController {

    @Value("server.port")
    private String port;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return "hello:" + name + ",I am form port : " + port;
    }


}
