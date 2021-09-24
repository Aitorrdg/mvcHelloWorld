/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;

import java.util.ResourceBundle;

/**
 *
 * @author Aitor, Zeeahan
 */
public class FileModelImplementation implements Model{
    /**
     * 
     * @return here this method will fetch the greeting from greeting File.
     */
    @Override
    public String getGreeting() {
        String greeting;
        ResourceBundle configFile;
        configFile = ResourceBundle.getBundle("mvchelloworld.model.greetingFile");
        greeting = configFile.getString("greeting");
        return greeting ;
    }
    
    
}
