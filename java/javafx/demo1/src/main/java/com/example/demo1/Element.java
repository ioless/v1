package com.example.demo1;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Element extends Pane {

    private int positionX = 0;
    private int positionY = 0;
    private int directionX = 1;
    private int directionY = 1;
    private int speed = 5;

    private int sceneWidth;
    private int sceneHeigth;


    private final Circle dot = new Circle(positionX, positionY, 3);
    private final Image image = new Image(new FileInputStream("/home/ai/Desktop/SilverChariotMangaAv.webp"));

    public void setSceneWidth(int sceneWidth) {
        this.sceneWidth = sceneWidth;
    }

    public void setSceneHeigth(int sceneHeigth) {
        this.sceneHeigth = sceneHeigth;
    }

    public Element(int positionX, int positionY) throws FileNotFoundException {
        this.positionX = positionX;
        this.positionY = positionY;

        var imageView = new ImageView(image);

        imageView.setX(positionX);
        imageView.setY(positionY);
        imageView.setPreserveRatio(true);

    }

    public void refresh(){

        dot.setCenterX(positionX);
        dot.setCenterY(positionY);

        if (directionX == 1) {
            positionX+= speed;
        }else{
            positionX-= speed;
        }

        if (directionY == 1) {
            positionY+= speed;
        }else{
            positionY-= speed;
        }
        if (positionX >= sceneWidth || positionX <= 0) {
            directionX = -1*directionX;
        }
        if (positionY >= sceneHeigth || positionY <= 0) {
            directionY = -1*directionY;
        }
    }

    private void gotoxy() {
        dot.setCenterX(positionX);
        dot.setCenterY(positionY);
    }

}
