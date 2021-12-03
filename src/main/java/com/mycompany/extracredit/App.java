package com.mycompany.extracredit;

import static java.lang.Math.random;
import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;



/**
 * JavaFX App
 */
public class App extends Application {
    Group sp;
    
   
    
    @Override
    public void start(Stage stage) {
        
        
        
        sp = new Group();
        var scene = new Scene(sp,500,500);
        
        
        // Car Tyre1
        Circle c1 = new Circle(150,200,100);
        c1.setFill(Color.LIGHTBLUE);
        c1.setStroke(Color.BLACK);
        sp.getChildren().add(c1);
        
        
        
        // Car Tyre2
        Circle c2 = new Circle(50,200,15);
        c2.setFill(Color.GREEN);
        c2.setStroke(Color.BLACK);
        sp.getChildren().add(c2);
        
        
        
        
        
        
        
        
        
            
       stage.setScene(scene);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}