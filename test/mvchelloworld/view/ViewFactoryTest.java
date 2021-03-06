/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aitor, Zeeshan
 */
public class ViewFactoryTest {
    /**
     * Test to check that view is getting generated correctly.
     */
    @Test
    public void testViewIsTextViewImplementation() {
       ViewFactory viewFactory=new ViewFactory();
       View view = viewFactory.getView();
       assertNotNull(view);
       assertTrue(view instanceof TextViewImplementation);
    }
    @Test
     public void testViewIsSwingViewImplementation() {
       ViewFactory viewFactory=new ViewFactory();
       View view = viewFactory.getView();
       assertNotNull(view);
       assertTrue(view instanceof JavaSwingViewImplementation);
    }
     @Test
    public void testViewIsJavaFxViewImplementation() {
       ViewFactory viewFactory=new ViewFactory();
       View view = viewFactory.getView();
       assertNotNull(view);
       assertTrue(view instanceof JavaFxViewImplementation);
    }
}
