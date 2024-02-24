package com.example.demo4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Group group = new Group();

        for( int i = 0; i < 15; i++) {


            int rand = (int) ((Math.random() * (800 - 0)) + 0);

            Unit myUnit =  Unit.newBuilder().withName("Name :" + i).
                    withCoords(rand, 30*i+30).build();

            group.getChildren().add( myUnit);

        }

        pane.getChildren().add(group);

        primaryStage.setScene(new Scene( pane, 800, 600));
        primaryStage.show();
    }

}
