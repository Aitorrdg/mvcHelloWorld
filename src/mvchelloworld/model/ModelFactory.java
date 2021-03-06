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
/**
 * Class that is responsible for generating and passing of an Object type of model.
 */
public class ModelFactory {

    /**
     *
     * @return This method will read the configuration file and based on assigned valued will return the model object.
     */
    public Model getModel() {

        ResourceBundle configFile;
        configFile = ResourceBundle.getBundle("configuration.config");
        String modelType = configFile.getString("modelType");
        Model model = null;
        switch (modelType) {
            case "1":
                model=new FileModelImplementation();
                break;
            case "2":
                model=new DBModelImplementation();
                break;
        }

        return model;
    }

}
