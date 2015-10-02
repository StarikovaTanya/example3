package com.company;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Comparator comparator
                = new GeometricObjectComparator();
        Set<GeometricObject> set
                = new TreeSet<GeometricObject>(comparator);
        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject elements : set) {
            System.out.println("area = " + elements.getArea());
        }

    }
}
