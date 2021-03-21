package com.example.springboottutorial.rest;

import com.example.springboottutorial.config.SpaceShipConfigurationProperties;
import com.example.springboottutorial.data.SpaceShip;
import com.example.springboottutorial.data.SpaceShipRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/spaceship")
@RequiredArgsConstructor
@Slf4j
public class SpaceShipRestController {
    private final MyHeavyWork myHeavyWork;
    private final SpaceShipRepository repository;
    private final SpaceShipConfigurationProperties configurationProperties;

    @PostMapping("/heavy")
    public String heavy() {
        log.info("heavy rest endpoint BEGIN");
        myHeavyWork.heavyStuff();
        log.info("heavy rest endpoint END");
        return "The job has started. Check the log if it went ok";
    }

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
