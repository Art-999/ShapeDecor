package com.company;

import com.company.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
