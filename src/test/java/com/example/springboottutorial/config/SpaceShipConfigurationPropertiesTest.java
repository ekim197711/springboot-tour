package com.example.springboottutorial.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("default")
class SpaceShipConfigurationPropertiesTest {

    @Autowired
    SpaceShipConfigurationProperties properties;
    @Test
    void testProperties() {
        Assertions.assertNotNull(properties.getFuel());
        Assertions.assertNotNull(properties.getCaptain());
        Assertions.assertNotNull(properties.getDestination());
        System.out.println(properties);
    }
}