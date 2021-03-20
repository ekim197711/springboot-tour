package com.example.springboottutorial.customcomponent;

import com.example.springboottutorial.config.SpaceShipConfigurationProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class MyCustomComponent {

    private final SpaceShipConfigurationProperties configurationProperties;

    public void sayHello(){
        log.info("Hello I'm a custom component! " + configurationProperties);
    }
}
