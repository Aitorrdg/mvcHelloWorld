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
 * @author 2dam
 */
public class DBModelImplementationTest {
    
    @Test
    public void testDBImplementationGetGreetingMethod() {
        Model model=new DBModelImplementation();
        assertNotNull("ERROR AT READING THE FILE",model.getGreeting());
        assertEquals("ERROR AT READING THE FILE","Hola Mundo:)",model.getGreeting());
    }
    
}
