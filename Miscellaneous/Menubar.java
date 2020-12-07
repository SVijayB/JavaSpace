package Miscellaneous;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MenuBar_2 extends Application 
{
    public void start(Stage s) 
    {
        s.setTitle("Demonstrate Menus");

        Menu M1 = new Menu("File");
        Menu M2 = new Menu("Options");
        Menu M3 = new Menu("Help");

        MenuItem m1 = new MenuItem("Open");
        MenuItem m2 = new MenuItem("Close");
        MenuItem m3 = new MenuItem("Save");
        MenuItem m4 = new MenuItem("Exit");

        M1.getItems().add(m1);
        M1.getItems().add(m2);
        M1.getItems().add(m3);
        M1.getItems().add(m4);

        Label l = new Label();

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() 
        {
            public void handle(ActionEvent e) 
            {
                l.setText("\n\n\n\n\n\n\n\t\t\t\t" + ((MenuItem) e.getSource()).getText() + " selected");
            }
        };

        m1.setOnAction(event);
        m2.setOnAction(event);
        m3.setOnAction(event);
        m4.setOnAction(event);
        MenuBar mb = new MenuBar();
        mb.getMenus().add(M1);
        mb.getMenus().add(M2);
        mb.getMenus().add(M3);
        VBox vb = new VBox(mb, l);
        Scene sc = new Scene(vb, 300, 300);
        s.setScene(sc);
        s.show();
    }

    public static void main(String args[]) 
    {
        launch(args);
    }
} 