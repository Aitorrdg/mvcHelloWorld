/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.view;

import java.util.ResourceBundle;

/**
 *
 * @author Aitor, Zeeshan
 */
/**
 * Class that is responsible for generating and passing of an Object type of View.
 */
public class ViewFactory {

    /**
     *
     * @return This method will read the configuration file and based on assigned valued will return the view object.
     */
    public View getView(){
        ResourceBundle configFile;
        configFile=ResourceBundle.getBundle("configuration.config");
        String viewType=configFile.getString("viewType");
        View view=null;
        switch(viewType){
            case "1":
                view = new TextViewImplementation();
                break;
            case "2":
                view= new JavaSwingViewImplementation();
                break;
            case "3":
                view= new JavaFxViewImplementation();
                break;
        }

        return view;
    }
}
