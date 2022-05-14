package com.example.bai2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class HelloApplication extends Application {
    Stage window;
    Scene scene1,scene2;
    public static void main(String[] args){ launch(args);}

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        Label label = new Label("Well come to my home");
        Button button1 = new Button("Go to course");
        Vbox layout1 = new VBox();
        layout1.getChildren().addAll(label, button1);
        scence1= new Scence(layout1, 300, 200);

        Button button2 = new Button("Go back");
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scence2= new Scence(layout2,200, 300);

        window.setScene(scence1);
        window.show();

    }
}