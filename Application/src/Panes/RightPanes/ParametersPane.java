/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Panes.RightPanes;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author btama
 */
public class ParametersPane extends StackPane {
    

    Button btnApplyParameters;
    Button btnHumidity;
    Button btnTimeElapsed;
    Button btnTemperature;
    Button btnLightLevel;
    HBox hboxphum;
    HBox hboxptime;
    HBox hboxptemp;
    HBox hboxplight;


   public ParametersPane() {
        setStyle("-fx-background-color: #505050;");
        // Add buttons, labels, or any other UI components if needed
         
        //Parameters Pane Components // --------------------------
        
         hboxphum = new HBox(10);
         hboxptime = new HBox(10);
         hboxptemp = new HBox(10);
         hboxplight = new HBox(10);


         /* HBox(HorizontalBox), sanki bir panelmiş gibi aşağıdaki 
        label,ComboBx gibi componentler için container görevi görür.
        Hbox. ... .addAll(compA,compB) ile compA ve comp, HBox'un içine ,yan yana 
        konulur. HBox(20) ise component'ler arasındaki boşluk */
         
         
        // Humidity
         Label labelHumidity = new Label("Humidity(%): ");
         labelHumidity.setFont(new Font(20));
         labelHumidity.setTextFill(Color.web("#ffffff"));
         
        ComboBox<Integer> cmbHumidity = new ComboBox<>();
        for (int i=1; i<=100;i++){
            cmbHumidity.getItems().add(i);
        }
        cmbHumidity.cursorProperty().set(Cursor.HAND);
        
         
         
         //Time Elapsed
         Label labelTimeElapsed = new Label("Time Elapsed: ");
         labelTimeElapsed.setFont(new Font(20));
         labelTimeElapsed.setTextFill(Color.web("#ffffff"));
         
         TextField textTimeElapsed = new TextField();
         
         
         
         //Temperature
         Label labelTemperature = new Label("Temperature(°C): ");
         labelTemperature.setFont(new Font(20));
         labelTemperature.setTextFill(Color.web("#ffffff"));
         
        ComboBox<Integer> cmbTemperature = new ComboBox<>();
        for (int i= 1; i<=60;i++){
            cmbTemperature.getItems().add(i);
        }         
         cmbTemperature.cursorProperty().set(Cursor.HAND);
         
         // Light Level
         Label labelLightLevel = new Label("Light Level: ");
         labelLightLevel.setFont(new Font(20));
         labelLightLevel.setTextFill(Color.web("#ffffff"));
         
        ComboBox<Integer> cmbLightLevel = new ComboBox<>();
        for (int i=50; i<=1000;i++){
            cmbLightLevel.getItems().add(i);
        }
        cmbLightLevel.cursorProperty().set(Cursor.HAND);
         
        //Parameters' Subpanes and Locations
        // NOLUYO AQQQQQQ, ComboBox'lar üstünde component oluğunda açılmıyor. HELP!!!!
         hboxphum.getChildren().addAll(labelHumidity,cmbHumidity);
         hboxphum.setTranslateY(50);  
         hboxphum.setTranslateX(50); 
         /* !!! VBox'ta ise setTranslate, bulunduğu panelin 
         sol üst köşesini baz alarak locationu belirler*/
         hboxptime.getChildren().addAll(labelTimeElapsed,textTimeElapsed);
         hboxptime.setTranslateY(150);
         hboxptime.setTranslateX(50);
       
         hboxptemp.getChildren().addAll(labelTemperature,cmbTemperature);
         hboxptemp.setTranslateY(250);
         hboxptemp.setTranslateX(50);
        
         hboxplight.getChildren().addAll(labelLightLevel,cmbLightLevel);
         hboxplight.setTranslateY(350);
         hboxplight.setTranslateX(50);
         
         //Buttons
         btnApplyParameters = new Button("Apply");
         btnApplyParameters.setTranslateX(350);
         btnApplyParameters.setTranslateY(150);
         btnApplyParameters.cursorProperty().set(Cursor.HAND);
         btnApplyParameters.setFont(new Font(20));
         

         
         btnHumidity= new Button("Humidity");
         btnHumidity.setTranslateX(-400);
         btnHumidity.setTranslateY(150);
         btnHumidity.cursorProperty().set(Cursor.HAND);
         btnHumidity.setFont(new Font(15));
         
         
         
         btnTimeElapsed = new Button("Time Elapsed");
         btnTimeElapsed.setTranslateX(-200);
         btnTimeElapsed.setTranslateY(150);
         btnTimeElapsed.cursorProperty().set(Cursor.HAND);
         btnTimeElapsed.setFont(new Font(15));
         
         
         
         btnTemperature = new Button("Temperature");
         btnTemperature.setTranslateX(0);
         btnTemperature.setTranslateY(150);
         btnTemperature.cursorProperty().set(Cursor.HAND);
         btnTemperature.setFont(new Font(15));
         
        
         
         btnLightLevel = new Button("Light Level");
         btnLightLevel.setTranslateX(200); // setTranslate bulunduğu panelin tam ortasını baz alaral locationu belirler
         btnLightLevel.setTranslateY(150);
         btnLightLevel.cursorProperty().set(Cursor.HAND);
         btnLightLevel.setFont(new Font(15));
         
         
         
         hboxphum.setVisible(true);
         hboxplight.setVisible(false);
         hboxptemp.setVisible(true);
         hboxptime.setVisible(false);
         
         getChildren().addAll(hboxphum,hboxplight,hboxptemp,hboxptime,btnApplyParameters,btnHumidity,btnTimeElapsed,btnTemperature,btnLightLevel);
        
        //------------------------------------------------------
        
        setButtonActions();
   
    }
    
        public void setButtonActions() {
        
       btnApplyParameters.setOnAction(e-> {});
       
       btnHumidity.setOnAction(e-> {
          
          
          hboxphum.setVisible(!hboxphum.isVisible());
           /* if(!getChildren().contains(hboxphum)){
                 
                 getChildren().add(hboxphum);
             }
             else{
                 getChildren().remove(hboxphum); 
             }*/
               // Visibility kullanmak yerine , silinip eklenmesini istedim ama  butona 2 kere basınca donuyor
       });

        btnHumidity.setOnMouseEntered(e -> {
        btnHumidity.setStyle("-fx-background-color: lightcyan;");
        });
         btnHumidity.setOnMouseExited(e -> {
         btnHumidity.setStyle("-fx-background-color: white;");
        });
       
       btnTimeElapsed.setOnAction(e-> {
         hboxptime.setVisible(!hboxptime.isVisible());
         });
       btnTimeElapsed.setOnMouseEntered(e -> {
        btnTimeElapsed.setStyle("-fx-background-color: lightcyan;");
        });
         btnTimeElapsed.setOnMouseExited(e -> {
         btnTimeElapsed.setStyle("-fx-background-color: white;");
        });
       
        btnTemperature.setOnAction(e-> {
         hboxptemp.setVisible(!hboxptemp.isVisible());
         });
        btnTemperature.setOnMouseEntered(e -> {
        btnTemperature.setStyle("-fx-background-color: lightcyan;");
        });
         btnTemperature.setOnMouseExited(e -> {
         btnTemperature.setStyle("-fx-background-color: white;");
        });
        
        btnLightLevel.setOnAction(e-> {
         hboxplight.setVisible(!hboxplight.isVisible());
         });
        btnLightLevel.setOnMouseEntered(e -> {
        btnLightLevel.setStyle("-fx-background-color: lightcyan;");
        });
         btnLightLevel.setOnMouseExited(e -> {
         btnLightLevel.setStyle("-fx-background-color: white;");
        });

    }
        


}
