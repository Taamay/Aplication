/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Panes.RightPanes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author btama
 */
public class MenuPane extends StackPane {
    
   public MenuPane() {
        setStyle("-fx-background-color: #707070;");
        
         Label labelWelcome = new Label("WELCOME");
         labelWelcome.setTranslateY(-250);   // setTranslate bulunduğu panelin tam ortasını baz alarak locationu belirler
         labelWelcome.setFont(new Font(80));
         labelWelcome.setTextFill(Color.RED);
         
         Label labelW1 = new Label("- We try to apply best conditions for you");
         labelW1.setTranslateY(-100);
         labelW1.setTranslateX(-200);
         labelW1.setFont(new Font(30));
         
         Label labelW2 = new Label("- You can set Paramaters and leave rest of us");
         labelW2.setTranslateY(-50);
         labelW2.setTranslateX(-175);
         labelW2.setFont(new Font(30));
         
         
        
         getChildren().addAll(labelWelcome,labelW1,labelW2);


    }
    
    
}
