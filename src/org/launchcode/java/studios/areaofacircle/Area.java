package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextFloat();
        System.out.println("The area of a circle with the radius of" + radius + "is: " + Circle.getArea(radius));
    }
}
