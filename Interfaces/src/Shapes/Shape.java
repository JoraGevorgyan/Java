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

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Shape tmp)) {
            return false;
        }
        return type_.equals(tmp.type_);
    }

    @Override
    public String toString() {
        return "Shape {" +
                "type = '" + type_ +
                "'}";
    }
}
