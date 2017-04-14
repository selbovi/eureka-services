package ru.croc.arch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by SMufazzalov on 12.04.2017.
 */
@SpringBootApplication
@EnableEurekaClient
public class FacadeClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacadeClientApplication.class, args);
    }

}
