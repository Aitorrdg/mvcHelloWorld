/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.view;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Aitor, Zeeshan
 */
public class JavaFxViewImplementation extends Application implements View{
    private static String greetFx;
    private Label label;
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label();
        label.setLayoutX(50);
        label.setLayoutY(85);
        label.setFont(new Font("Arial", 30));
        label.setText(greetFx);
        Pane root = new Pane();
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * 
     * @param greet showing greeting.
     */
    @Override
    public void showGreeting(String greet) {
        greetFx=greet;
        launch(new String[1]);
    }
   

    
}
