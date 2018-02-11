package com.ttn.generics;


import java.util.ArrayList;
import java.util.List;

public class GenericTest1 {

    public static void drawShapes(List<? extends Shape> lists) {

        for(Shape s: lists) {
            s.draw();
        }
    }

    public static void main(String[] args) {

        List<Rectangle> rectangleList = new ArrayList<Rectangle>();
        rectangleList.add(new Rectangle());

        List<Circle> circleList = new ArrayList<Circle>();
        circleList.add(new Circle());
        circleList.add(new Circle());

        drawShapes(rectangleList);
        drawShapes(circleList);
    }
}
