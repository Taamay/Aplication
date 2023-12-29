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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 *
 * @author btama
 */
public class ResponsePane extends StackPane {
    
  public ResponsePane(){
      setStyle("-fx-background-color: #404040;");
      
     /* VBox vbox1 = new VBox();
      vbox1.setTranslateX(100);
      vbox1.setTranslateY(50);
      Label labelbox1 = new Label("VBox1");
      labelbox1.setFont(new Font(30));
      vbox1.getChildren().add(labelbox1);
      
       /* !!! VBox'ta setTranslate, bulunduğu panelin 
         sol üst köşesini baz alarak locationu belirler*/
       
     /* VBox vbox2 = new VBox();
      vbox2.setTranslateX(100);
      vbox2.setTranslateY(100);
      Label labelbox2 = new Label("VBox2");
      labelbox2.setFont(new Font(30));
      vbox2.getChildren().add(labelbox2);
      
      VBox vbox3 = new VBox();
      vbox3.setTranslateX(100);
      vbox3.setTranslateY(150);
      Label labelbox3 = new Label("VBox3");
      labelbox3.setFont(new Font(30));
      vbox3.getChildren().add(labelbox3);
      
      VBox vbox4 = new VBox();
      vbox4.setTranslateX(100);
      vbox4.setTranslateY(200);
      Label labelbox4 = new Label("VBox4");
      labelbox4.setFont(new Font(30));
      vbox4.getChildren().add(labelbox4);
      
      VBox vbox5 = new VBox();
      vbox5.setTranslateX(100);
      vbox5.setTranslateY(250);
      Label labelbox5 = new Label("VBox5");
      labelbox5.setFont(new Font(30));
      vbox5.getChildren().add(labelbox5);
      
      VBox vbox6 = new VBox();
      vbox6.setTranslateX(100);
      vbox6.setTranslateY(300);
      Label labelbox6 = new Label("VBox6");
      labelbox6.setFont(new Font(30));
      vbox6.getChildren().add(labelbox6);
      
      VBox vbox7 = new VBox();
      vbox7.setTranslateX(100);
      vbox7.setTranslateY(350);
      Label labelbox7 = new Label("VBox7");
      labelbox7.setFont(new Font(30));
      vbox7.getChildren().add(labelbox7);
      
      VBox vbox8 = new VBox();
      vbox8.setTranslateX(100);
      vbox8.setTranslateY(400);
      Label labelbox8 = new Label("VBox8");
      labelbox8.setFont(new Font(30));
      vbox8.getChildren().add(labelbox8);
      
      VBox vbox9 = new VBox();
      vbox9.setTranslateX(100);
      vbox9.setTranslateY(450);
      Label labelbox9 = new Label("VBox9");
      labelbox9.setFont(new Font(30));
      vbox9.getChildren().add(labelbox9);
      
      VBox vbox10 = new VBox();
      vbox10.setTranslateX(100);
      vbox10.setTranslateY(500);
      Label labelbox10 = new Label("VBox10");
      labelbox10.setFont(new Font(30));
      vbox10.getChildren().add(labelbox10);
      
      VBox vbox11 = new VBox();
      vbox11.setTranslateX(100);
      vbox11.setTranslateY(550);
      Label labelbox11 = new Label("VBox11");
      labelbox11.setFont(new Font(30));
      vbox11.getChildren().add(labelbox11);
      
      VBox vbox12 = new VBox();
      vbox12.setTranslateX(100);
      vbox12.setTranslateY(600);
      Label labelbox12 = new Label("VBox12");
      labelbox12.setFont(new Font(30));
      vbox12.getChildren().add(labelbox12);
      
      */
     
     /* VBox(VorizontalBox), sanki bir panelmiş gibi aşağıdaki 
        label,ComboBx gibi componentler için container görevi görür.
        Vbox. ... .addAll(compA,compB) ile compA ve comp, VBox'un içine ,alt alta 
        konulur. */ 
     
     
          for(int j=1;j<=12;j++){
              VBox vbox= new VBox();
              vbox.setTranslateX(100);
              vbox.setTranslateY(50*j);
              Label labelbox = new Label("VBox"+String.valueOf(j));
              labelbox.setFont(new Font(30));
              vbox.getChildren().add(labelbox);
              getChildren().add(vbox);
          }
          
           for(int j=1;j<=12;j++){
              VBox vbox= new VBox();
              vbox.setTranslateX(300);
              vbox.setTranslateY(50*j);
              Label labelbox = new Label("VBoxxxxxxxxx"+String.valueOf(j+12));
              labelbox.setFont(new Font(30));
              vbox.getChildren().add(labelbox);
              getChildren().add(vbox);
          }
         /* !!! VBox'ta setTranslate, bulunduğu panelin 
         sol üst köşesini baz alarak locationu belirler*/

        int index = 5; 
        VBox setVBox = (VBox) getChildren().get(12 + index); // 18. vbox
        Label setLabel = (Label) setVBox.getChildren().get(0);
        setLabel.setText("New Text");
        
        // Burda, yukarıdaki 116 satırlık saçmalığı yaptıktan sonra aklıma döngü kullanmak geldi
        // sonrasında ise indekse ulaşıp setText ile değişiklik yapabildim. 
        // Belki duruma göre o 116 satır mantıklı gelir diye silmedim .d
      
      
      
      
      
  }
    
}
