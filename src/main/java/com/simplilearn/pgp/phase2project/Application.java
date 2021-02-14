package com.simplilearn.pgp.phase2project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Learner's Academy Spring Boot Application.
 *
 * @author Sandeep Kumar Jakkaraju
 */
@SpringBootApplication(proxyBeanMethods = false)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
