/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aitor, Zeeshan
 */
public class DBModelImplementationTest {

    /**
     * Test to check the values of greeting is being fetched correctly from
     * Database.
     */
    @Test
    public void testDBImplementationGetGreetingMethod() {
        Model model = new DBModelImplementation();
        try {
            assertNotNull("ERROR AT READING THE FILE", model.getGreeting());
            assertEquals("ERROR AT READING THE FILE", "Hola Mundo DB:)", model.getGreeting());
        } catch (Exception ex) {
        }

    }
}
