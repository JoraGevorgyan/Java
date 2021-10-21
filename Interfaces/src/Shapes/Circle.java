package Shapes;

import Interfaces.Drawable;
import Interfaces.Printable;
import Interfaces.Showable;

public class Circle implements Drawable, Printable, Showable {
    private final Integer radius_;

    public Circle() {
        radius_ = 0;
    }
    public Circle(Integer radius) {
        radius_ = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius = " + radius_ + " is drawing!");
    }
    @Override
    public void print() {
        System.out.println("Circle with radius = " + radius_ + " is printing!");
    }
    @Override
    public void show() {
        System.out.println("Circle with radius = " + radius_ + " is showing!");
    }
}
