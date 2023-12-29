package application;

import Panes.LeftPanes.LeftPane;
import Panes.RightPanes.LoginPane;
import Panes.RightPanes.MenuPane;
import Panes.RightPanes.ParametersPane;
import Panes.RightPanes.ResponsePane;
import Panes.RightPanes.WeatherPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static SplitPane splitPane;  // Declare splitPane as a static class field
    
    @Override
    public void start(Stage primaryStage) {
        

        MenuPane menuPane = new MenuPane();
        LoginPane loginPane = new LoginPane();
        ParametersPane parametersPane = new ParametersPane();
        ResponsePane responsePane = new ResponsePane();
        WeatherPane weatherPane = new WeatherPane();


        // SplitPane
        splitPane = new SplitPane();
        splitPane.getItems().addAll( new LeftPane(menuPane, loginPane, parametersPane, responsePane, weatherPane),menuPane);
        splitPane.setDividerPositions(0.25); // Initial ratio, adjust as needed
        

        Scene scene = new Scene(splitPane, 1500, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Resizable SplitPane Example");
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }    
    
    public static SplitPane getSplitPane() {
        return splitPane;
    }
}
