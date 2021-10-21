package com.company;

import Interfaces.Drawable;
import Shapes.Circle;
import Shapes.Shape;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Drawable> shapes = new ArrayList<>();
        int index = 0;
        shapes.add(index++, new Shape("Rectangle"));
        shapes.add(index++, new Circle(index * index));
        shapes.add(index++, new Shape("Square"));

        for (int i = 0; i < index; ++i) {
            shapes.get(i).draw();
        }
    }
}
