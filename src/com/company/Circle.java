package com.company;

/**
 * Created by Таня on 18.09.2015.
 */
public class Circle extends GeometricObject {
    private double radius;
    public Circle(double r){
        radius = r;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 2*3.14*radius*radius;
    }
}
