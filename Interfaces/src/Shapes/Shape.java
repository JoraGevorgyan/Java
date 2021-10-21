package Shapes;

import Interfaces.Drawable;
import Interfaces.Printable;

public class Shape implements Drawable, Printable {
    private final String type_;

    public Shape() {
        type_ = "unknown type";
    }
    public Shape(String type) {
        type_ = type;
    }

    @Override
    public void draw() {
        System.out.println("Shape is drawing a " + type_ + "!");
    }

    @Override
    public void print() {
        System.out.println("Shape is printing a " + type_ + "!");
    }
}
