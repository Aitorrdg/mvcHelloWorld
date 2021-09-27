/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Aitor, Zeeshan
 */
public class FileModelImplementationTest {
    /**
     *Test to check the values of greeting is being fetched correctly from File.
     */
    @Test
    @Ignore
    public void testFileImplementationGetGreetingMethod() {
        Model model=new FileModelImplementation();
        assertNotNull("ERROR AT READING THE FILE",model.getGreeting());
        assertEquals("ERROR AT READING THE FILE","Hola Mundo Desde Un Archivo:)",model.getGreeting());
    }
}
