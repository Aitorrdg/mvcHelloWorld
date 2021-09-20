/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;

import java.util.ResourceBundle;


/**
 *
 * @author Zeeshan,Aitor
 */
public class ModelFactory {

    public Model getModel() {

        ResourceBundle configFile;
        configFile = ResourceBundle.getBundle("configuration.config");
        String modelType = configFile.getString("modelType");
        Model model;
        switch (modelType) {
            case "1":
                /*model=*/
                break;
            case "2":
               /* model=*/
                break;
        }

        return null;
    }

}
