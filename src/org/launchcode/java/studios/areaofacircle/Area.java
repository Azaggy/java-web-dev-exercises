package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius;
        radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);
        if (radius < 0) {
            System.err.println("Radius must be a positive number.");
        }
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
