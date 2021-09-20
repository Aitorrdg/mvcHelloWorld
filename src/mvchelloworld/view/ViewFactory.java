/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.view;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
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
                
                break;
            case "3":
                
                break;
        }

        return view;
    }
}
