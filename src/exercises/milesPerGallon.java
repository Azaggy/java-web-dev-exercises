package exercises;

import java.util.Scanner;


public class milesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven:");
        double miles = input.nextDouble();
        System.out.println("How many gallons has your car consumed:");
        double gallons = input.nextDouble();
        double mPG = miles / gallons;
        System.out.println("Your cars miles per gallon is " + mPG + " after consuming " +gallons + " gallons for " + miles + " miles.");
    }
}
