package com.example.springboottutorial.customcomponent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("production")
class MyCustomComponentTest {
    @Autowired
    MyCustomComponent myCustomComponent;

    @Test
    void sayHello() {
        myCustomComponent.sayHello();
    }
}