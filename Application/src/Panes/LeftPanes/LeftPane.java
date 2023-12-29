/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Panes.LeftPanes;

import Panes.RightPanes.MenuPane;
import Panes.RightPanes.LoginPane;
import Panes.RightPanes.ParametersPane;
import Panes.RightPanes.ResponsePane;
import Panes.RightPanes.WeatherPane;
import application.Main;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author btama
 */
public class LeftPane  extends StackPane {
    
     Button btnMenu;
     Button btnLogin;
     Button btnParm;
     Button btnResp;
     Button btnWeather;
    private MenuPane menuPane;
    private LoginPane loginPane;
    private ParametersPane parametersPane;
    private ResponsePane responsePane;
    private WeatherPane weatherPane;
    public LeftPane(MenuPane menuPane, LoginPane loginPane, ParametersPane parametersPane, ResponsePane responsePane, WeatherPane weatherPane) {
        this.menuPane = menuPane;
        this.loginPane = loginPane;
        this.parametersPane = parametersPane;
        this.responsePane = responsePane;
        this.weatherPane =  weatherPane;
        
        setStyle("-fx-background-color: #000401;");
         
        //Left Pane Components // --------------------------
        
        //Menu Buton
        btnMenu = new Button("Menu");
        btnMenu.setTranslateY(-200); // setTranslate bulunduğu panelin tam ortasını baz alarak locationu belirler
        btnMenu.setPrefSize(100, 50);
        btnMenu.cursorProperty().set(Cursor.HAND);
        //Login Buton
        btnLogin = new Button("Login");
        btnLogin.setTranslateY(-100);
        btnLogin.setPrefSize(100, 50);
        btnLogin.cursorProperty().set(Cursor.HAND);
        //Parameters Buton
        btnParm = new Button("Parameters");
        btnParm.setPrefSize(100, 50);
        btnParm.cursorProperty().set(Cursor.HAND);
        // Response Buton
        btnResp = new Button("Response");
        btnResp.setTranslateY(+100);
        btnResp.setPrefSize(100, 50);
        btnResp.cursorProperty().set(Cursor.HAND);
        // Weather Buton
        btnWeather = new Button("Weather");
        btnWeather.setTranslateY(+200);
        btnWeather.setPrefSize(100, 50);
        btnWeather.cursorProperty().set(Cursor.HAND);
        
        setButtonActions(weatherPane,menuPane, loginPane, parametersPane, responsePane);
        
        getChildren().addAll(btnMenu,btnLogin,btnParm,btnResp,btnWeather);
   
    }
    
        public void setButtonActions(WeatherPane weatherPane,MenuPane menuPane, LoginPane loginPane, ParametersPane parametersPane, ResponsePane responsePane) {

        
        //Menu Buton Action
        btnMenu.setOnAction(e -> openPane(new MenuPane())); 
        
        btnMenu.setOnMouseEntered(e -> {
        btnMenu.setStyle("-fx-background-color: lightcyan;");
        });
         btnMenu.setOnMouseExited(e -> {
         btnMenu.setStyle("-fx-background-color: white;");
        });
        //Login Buton Action
        btnLogin.setOnAction(e -> openPane(new LoginPane()));
        
        btnLogin.setOnMouseEntered(e -> {
        btnLogin.setStyle("-fx-background-color: lightcyan;");
        });
         btnLogin.setOnMouseExited(e -> {
         btnLogin.setStyle("-fx-background-color: white;");
        });
        
        //Parameter Buton Action
        btnParm.setOnAction(e -> openPane(new ParametersPane()));
        
        btnParm.setOnMouseEntered(e -> {
        btnParm.setStyle("-fx-background-color: lightcyan;");
        });
         btnParm.setOnMouseExited(e -> {
         btnParm.setStyle("-fx-background-color: white;");
        });
        
        //Response Buton Action
        btnResp.setOnAction(e -> openPane(new ResponsePane()));
        
        btnResp.setOnMouseEntered(e -> {
        btnResp.setStyle("-fx-background-color: lightcyan;");
        });
         btnResp.setOnMouseExited(e -> {
         btnResp.setStyle("-fx-background-color: white;");
        });
        
        // Weather Buton Action
        btnWeather.setOnAction(e-> openPane(new WeatherPane()));
        
        btnWeather.setOnMouseEntered(e -> {
        btnWeather.setStyle("-fx-background-color: lightcyan;");
        });
         btnWeather.setOnMouseExited(e -> {
         btnWeather.setStyle("-fx-background-color: white;");
        });
        
   

    }

    public void openPane(StackPane pane) {  

        
        Main.getSplitPane().getItems().remove(1); // Remove the current right pane
        Main.getSplitPane().getItems().add(pane); // Add the new pane
        Main.getSplitPane().setDividerPositions(0.25); // Initial ratio, adjust as needed
        
    }
    
   
}
    

