/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.view;

/**
 *
 * @author Zeeshan,Aitor
 */
public interface View {
    /**
     * 
     * @param greet which is  received from the database or the file, to be shown.
     * @throws java.lang.Exception
     * 
     */
    
    public void showGreeting(String greet) throws Exception;
    
}
