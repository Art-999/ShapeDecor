package com.company;

import com.company.interfaces.Shape;

public class Main {

    public static void main(String[] args) {

        Shape rectangle=new Rectangle();
        rectangle.draw();

        Shape redRectangle=new RedShapeDecorator(rectangle);
        redRectangle.draw();
    }
}
