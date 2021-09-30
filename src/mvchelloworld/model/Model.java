/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;

/**
 *
 * @author Zeeshan,Aitor
 */
public interface Model {
    /**
     * 
     * @return the greeting that is stored in a database or in a file.
     * @throws java.lang.Exception
     */
    public String getGreeting() throws Exception;
    
}
