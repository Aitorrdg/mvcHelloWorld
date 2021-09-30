/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;

import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            assertNotNull("ERROR AT READING THE FILE",model.getGreeting());
            assertEquals("ERROR AT READING THE FILE","Hola Mundo Desde Un Archivo:)",model.getGreeting());
        } catch (Exception ex) {
            Logger.getLogger(FileModelImplementationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
