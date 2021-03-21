package com.example.springboottutorial.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyHeavyWork {

    @Async
    public void heavyStuff(){
        log.info("Heavy BEGIN");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Heavy END");
    }
}
