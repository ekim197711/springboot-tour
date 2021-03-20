package com.example.springboottutorial.rest;

import com.example.springboottutorial.config.SpaceShipConfigurationProperties;
import com.example.springboottutorial.data.SpaceShip;
import com.example.springboottutorial.data.SpaceShipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/spaceship")
@RequiredArgsConstructor
public class SpaceShipRestController {
    private final SpaceShipRepository repository;
    private final SpaceShipConfigurationProperties configurationProperties;

    @GetMapping("/")
    public Iterable<SpaceShip> ships() {
        return repository.findAll();
    }

    @GetMapping("/{captain}/")
    public Iterable<SpaceShip> ships(@PathVariable String captain) {
        return repository.findByCaptain(captain);
    }

    @PostMapping("/")
    public Iterable<SpaceShip> shipCreate(@RequestBody SpaceShip ship) {
        repository.save(ship);
        return repository.findAll();
    }

    @PostMapping("/default")
    public Iterable<SpaceShip> shipCreateDefault() {
        repository.save(new SpaceShip(
                null,
                configurationProperties.getCaptain(),
                configurationProperties.getDestination(),
                configurationProperties.getFuel()
        ));
        return repository.findAll();
    }
}
