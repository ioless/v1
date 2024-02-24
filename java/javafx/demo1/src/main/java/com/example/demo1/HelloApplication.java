package com.example.demo1;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class HelloApplication extends Application {
    private int x = 20;
    private int y = 20;

    private int speed = 5;


    private int sceneWidth = 800;
    private int sceneHeigth = 600;

    private int directionX = 1;
    private int directionY = 1;


    private String status = "";

    private final Circle dot = new Circle(20, 20, 3);
    private final Circle dot3 = new Circle(30, 30, 3);
    private final Element dot2 = new Element(20, 20);


    private Group root;
    

    private final TimeCounter counter = new TimeCounter();

    public HelloApplication() throws FileNotFoundException {
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws Exception {
        final Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new EventHandler() {
                    @Override
                    public void handle(Event event) {
                        refreshScene();
                    }
                }),
                new KeyFrame(Duration.millis(10))
        );
        timeline.setCycleCount(Timeline.INDEFINITE);

        stage.setScene(new Scene(new Group(dot, dot3, dot2), sceneWidth, sceneHeigth));
        stage.show();

        dot2.setSceneHeigth((int) stage.getHeight());
        dot2.setSceneWidth((int) stage.getWidth());

        System.out.println(stage.getWidth());
        counter.reset();
        timeline.play();
    }

    private void refreshScene() {

        gotoxy(x, y);

        if (directionX == 1) {
            x+= speed;
        }else{
            x-= speed;
        }

        if (directionY == 1) {
            y+= speed;
        }else{
            y-= speed;
        }
        if (x >= sceneWidth || x <= 0) {
            directionX = -1*directionX;
        }
        if (y >= sceneHeigth || y <= 0) {
            directionY = -1*directionY;
        }

//        status = "*****".equals(status) ? "*" : status + "*";
        System.out.println(x + ":"  +y);


    }

    private void gotoxy(int x, int y) {
        dot.setCenterX(x);
        dot.setCenterY(y);
    }

    class TimeCounter {
        private long start = new Date().getTime();

        void reset() {
            start = new Date().getTime();
        }

        long elapsed() {
            return new Date().getTime() - start;
        }
    }
}