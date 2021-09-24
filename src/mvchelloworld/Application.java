/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld;

import mvchelloworld.controller.Controller;
import mvchelloworld.model.Model;
import mvchelloworld.model.ModelFactory;
import mvchelloworld.view.View;
import mvchelloworld.view.ViewFactory;

/**
 *
 * @author Zeeshan,Aitor
 */
public class Application {

    /**
     * @param args 
     * From here our application starts by getting Model and view from their perspectives factories and sending them
     * to the controller
     */
    public static void main(String[] args) {
        ModelFactory modelFactory =new ModelFactory();
        Model model=modelFactory.getModel();
        ViewFactory viewFactory=new ViewFactory();
        View view=viewFactory.getView();
        Controller controller=new Controller(model,view);
    }
    
}
