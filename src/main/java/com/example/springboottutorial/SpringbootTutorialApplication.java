package com.example.springboottutorial;

import com.example.springboottutorial.config.SpaceShipConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties({SpaceShipConfigurationProperties.class})
@EnableScheduling
@EnableAsync
public class SpringbootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTutorialApplication.class, args);
    }

}
