package ru.croc.arch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by SMufazzalov on 12.04.2017.
 */
@SpringBootApplication
@EnableEurekaClient
public class FacadeClientApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FacadeClientApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FacadeClientApplication.class);
    }
}
