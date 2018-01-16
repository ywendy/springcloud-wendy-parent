package cn.com.yooeee.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wendy on 2018/1/16.
 */
@EnableEurekaServer
@SpringBootApplication
public class YooeeeEurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(YooeeeEurekaServerApplication.class).web(true).run(args);
    }

}
