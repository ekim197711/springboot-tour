package com.example.springboottutorial.data;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpaceShipRepository extends CrudRepository<SpaceShip, Integer> {
    public List<SpaceShip> findByCaptain(String captain);
    public List<SpaceShip> findByDestination(String destination);
}
