package com.example.springboottutorial.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spaceship.default")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShipConfigurationProperties {
    private String captain;
    private String destination;
    private int fuel;
}
