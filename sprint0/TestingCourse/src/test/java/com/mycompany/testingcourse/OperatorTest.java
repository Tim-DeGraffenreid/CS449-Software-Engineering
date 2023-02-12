/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testingcourse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Timd
 */
public class OperatorTest {
    
    public OperatorTest() {
    }

    /**
     * Test of sum method, of class Operator.
     */
    @org.junit.jupiter.api.Test
    public void testSum() {
        System.out.println("sum");
        int a = 2;
        int b = 3;
        Operator instance = new Operator();
        int expResult = 5;
        int result = instance.sum(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplication method, of class Operator.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int a = 5;
        int b = 3;
        Operator instance = new Operator();
        int expResult = 15;
        int result = instance.multiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of helloWorld method, of class Operator.
     
    @org.junit.jupiter.api.Test
    public void testHelloWorld() {
        System.out.println("helloWorld");
        Operator instance = new Operator();
        String expResult = "helloWorld";
        String result = instance.helloWorld();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }
    */
}
