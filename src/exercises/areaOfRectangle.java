package exercises;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle:");
        double length = input.nextDouble();
        System.out.println("What is the width of the rectangle:");
        double width = input.nextDouble();
        double area = width * length;
        System.out.println("The area of a rectangle with a width of " + width + " and a length of " + length + " is: " + area);
    }
}
