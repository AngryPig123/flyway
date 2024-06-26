package org.multimodule.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

@SpringBootApplication
public class FlywayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlywayApplication.class, args);
    }

}
