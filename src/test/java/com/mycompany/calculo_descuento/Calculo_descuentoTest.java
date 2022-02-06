/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculo_descuento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jjrb
 */
public class Calculo_descuentoTest {
    
    public Calculo_descuentoTest() {
    }

    /**
     * Test of calculo_descuento method, of class Calculo_descuento.
     */
    @Test
    public void testCalculo_descuento() {
        System.out.println("calculo_descuento");
        int precio = 500;
        int desc = 10;
        Calculo_descuento instance = new Calculo_descuento();
        double expResult = 50.0;
        double result = instance.calculo_descuento(precio, desc);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
