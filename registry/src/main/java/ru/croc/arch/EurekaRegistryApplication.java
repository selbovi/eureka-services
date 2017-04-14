package ru.croc.arch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by SMufazzalov on 12.04.2017.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegistryApplication.class, args);
    }

}
