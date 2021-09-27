/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aitor, Zeeshan
 */
public class DBModelImplementationTest {
    /**
     * Test to check the values of greeting is being fetched correctly from Database.
     */
    @Test
    public void testDBImplementationGetGreetingMethod() {
        Model model=new DBModelImplementation();
        assertNotNull("ERROR AT READING THE FILE",model.getGreeting());
        assertEquals("ERROR AT READING THE FILE","Hola Mundo DB:)",model.getGreeting());
    }
    
}
