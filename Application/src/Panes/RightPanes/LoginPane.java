/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Panes.RightPanes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author btama
 */
public class LoginPane extends StackPane {
    
    Button btnApplyLogin;
    public LoginPane() {
        setStyle("-fx-background-color: #606060;");

         
         TextField textGmail = new TextField();
         textGmail.setTranslateY(-200); // setTranslate bulunduğu panelin tam ortasını baz alarak locationu belirler
         textGmail.setTranslateX(-230);
         textGmail.setMaxWidth(200);
         
         Label labelGmail = new Label("Gmail: ");
         labelGmail.setTranslateY(-200);
         labelGmail.setTranslateX(-450);
         labelGmail.setFont(new Font(30));
         
         TextField textPassword = new TextField();
         textPassword.setTranslateY(-100);
         textPassword.setTranslateX(-230);
         textPassword.setMaxWidth(200);
         
         Label labelPassword = new Label("Password: ");
         labelPassword.setTranslateY(-100);
         labelPassword.setTranslateX(-430);
         labelPassword.setFont(new Font(30));
         
         btnApplyLogin = new Button("Apply");
         //btnApplyLogin.setTranslateY(0);
         btnApplyLogin.setTranslateX(100);
         btnApplyLogin.setPrefSize(100, 50);
         btnApplyLogin.cursorProperty().set(Cursor.HAND);
         btnApplyLogin.setFont(new Font(20));
         
         
        // Apply Button Actions
         btnApplyLogin.setOnAction(e->{});
         
         btnApplyLogin.setOnMouseEntered(e -> {
         btnApplyLogin.setStyle("-fx-background-color: lightcyan;");
        });
         btnApplyLogin.setOnMouseExited(e -> {
         btnApplyLogin.setStyle("-fx-background-color: white;");
        });
         
         

        getChildren().addAll(labelGmail,textGmail,labelPassword,textPassword,btnApplyLogin);
        
        setButtonActions(btnApplyLogin);
   
    }
    
        public void setButtonActions(Button btnApplyLogin) {
        
        
         btnApplyLogin.setOnAction(e->{});

   

    }
    
}
