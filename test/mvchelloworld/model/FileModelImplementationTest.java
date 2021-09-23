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
 * @author 2dam
 */
public class FileModelImplementationTest {
    
    @Test
    @Ignore
    public void testFileImplementationGetGreetingMethod() {
        Model model=new FileModelImplementation();
        assertNotNull("ERROR AT READING THE FILE",model.getGreeting());
        assertEquals("ERROR AT READING THE FILE","Hola Mundo:)",model.getGreeting());
    }
}
