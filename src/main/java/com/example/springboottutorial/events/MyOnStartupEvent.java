package com.example.springboottutorial.events;

import com.example.springboottutorial.data.SpaceShip;
import com.example.springboottutorial.data.SpaceShipRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
@RequiredArgsConstructor
public class MyOnStartupEvent {
    private final SpaceShipRepository repository;

    @EventListener
    public void onStartUp(ApplicationStartedEvent event) {
        log.info("App has been started... Now create some space ships");
        repository.save(new SpaceShip(null, "Poul", "Alfa Centauri", 92));
        repository.save(new SpaceShip(null, "Penny", "Jupiter Moon no 2", 52));
        repository.save(new SpaceShip(null, "Ulla", "Jupiter Mooo no 3", 31));
    }
    @EventListener
    public void onAnything(ApplicationEvent event) {
        log.info("Event occured!!! " + event.getClass().getSimpleName());
    }
}
