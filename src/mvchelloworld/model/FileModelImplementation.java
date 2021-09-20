/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class FileModelImplementation implements Model{
    
    @Override
    public String getGreeting() {
        String greeting;
        ResourceBundle configFile;
        configFile = ResourceBundle.getBundle("mvchelloworld.model.greetingFile");
        greeting = configFile.getString("greeting");
        return greeting ;
    }
    
    
}
