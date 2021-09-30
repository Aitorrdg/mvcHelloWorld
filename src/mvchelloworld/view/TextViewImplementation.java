/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.view;

/**
 *
 * @author Aitor, Zeeshan
 */
/**
 * 
 **  Class responsible for Text UI model implementation.
 */
public class TextViewImplementation implements View {
/**
 * 
 * @param greet Showing greeting on console.
 */
    @Override
    public void showGreeting(String greet) {
        System.out.println(greet);
    }

}
