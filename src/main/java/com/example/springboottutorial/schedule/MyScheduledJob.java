package com.example.springboottutorial.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Configuration
@Slf4j
public class MyScheduledJob {
//    second
//            minute
//    hour
//    day of month
//            month
//    day of week
    @Scheduled(fixedDelay = 5*1000, initialDelay = 3000)
    void doStuff(){
      log.info("Job is running... " + LocalDateTime.now());
    }
}
