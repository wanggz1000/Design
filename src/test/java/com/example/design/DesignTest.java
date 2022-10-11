package com.example.design;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesignTest {
    Design exp = new Design();

    @Test
    void greenTest1(){
        String a = "green";
        String expectedResult = "red";
        String result = exp.Green(a);
        assertEquals(expectedResult,result);
    }

    @Test
    void redTest1(){
        String a = "red";
        String expectedResult = "green";
        String result = exp.Red(a);
        assertEquals(expectedResult,result);
    }

    @Test
    void blueTest1(){
        String a = "blue";
        String expectedResult = "orange";
        String result = exp.Blue(a);
        assertEquals(expectedResult,result);
    }

}
