package com.company;

import com.company.GeometricObject;

/**
 * Created by Таня on 18.09.2015.
 */
public class Rectangle extends GeometricObject {
    private double sideA;
    private double sideB;
    public Rectangle(double a, double b){
        sideA=a;
        sideB=b;
    }
    @Override
    public  double getArea(){
        return sideA*sideB;
    }
}
