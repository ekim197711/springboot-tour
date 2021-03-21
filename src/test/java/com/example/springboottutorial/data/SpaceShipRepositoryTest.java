package com.example.springboottutorial.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpaceShipRepositoryTest {

    @Autowired
    SpaceShipRepository repository;

    @BeforeEach
    void fillDB(){
        repository.deleteAll();
        repository.save(new SpaceShip(null, "John", "Mars", 99));
        repository.save(new SpaceShip(null, "Jenny", "Moon", 44));
        repository.save(new SpaceShip(null, "Anna", "Jupiter", 33));
        repository.save(new SpaceShip(null, "Elise", "Venus", 22));
        repository.save(new SpaceShip(null, "Carina", "Mercury", 100));
        repository.save(new SpaceShip(null, "Elise", "Saturn", 10));
    }

    @Test
    void findByCaptain() {
        List<SpaceShip> byCaptain = repository.findByCaptain("Elise");
        Assertions.assertEquals(2, byCaptain.size());
        byCaptain.forEach(System.out::println);
    }

    @Test
    void findByDestination() {
        List<SpaceShip> byDestination = repository.findByDestination("Mercury");
        Assertions.assertEquals(1, byDestination.size());
        byDestination.forEach(System.out::println);
    }

    @Test
    void findAll() {
        Iterable<SpaceShip> all = repository.findAll();
        all.forEach(System.out::println);
    }
}