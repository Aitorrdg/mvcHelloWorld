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
public class ModelFactoryTest {
    /**
     * Test to chech if Model Factory is generating object model properly.
     */
    @Test
    public void testSomeMethod() {
        ModelFactory modelFactory=new ModelFactory();
        Model model=modelFactory.getModel();
        assertNotNull(model);
        assertTrue(model instanceof DBModelImplementation);
    }
    
}
