package com.example.slmtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlmTestApplicationTests {

    @Autowired
    public SumController controller;

    @Test
    public void sumTest() {
        int test = controller.sum(1, 2, 3, 4);
        int result = 1+2+3+4;
        assertEquals(test, result);
    }

}
