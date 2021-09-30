/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import mvchelloworld.model.Model;
import mvchelloworld.view.View;

/**
 *
 * @author Aitor, Zeeshan
 */
public class Controller {
    private Model model;
    private View view;

    /**
     *
     * @param model we recieved this model from model factory based on the assigned value in the  configuration file
     * @param view  we recieved this view from view factory based on the assigned value in the configuration file
     * 
     * After that based on values Greeting will be showed.
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        try {
            view.showGreeting(model.getGreeting());
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
