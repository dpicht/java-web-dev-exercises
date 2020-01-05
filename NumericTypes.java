package exercises;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Amount of Miles Driven:");
        float milesDriven = input.nextFloat();
        System.out.println("Gallons Used:");
        float gallonsUsed = input.nextFloat();
        System.out.println("Miles Per Gallon: " + (milesDriven/gallonsUsed));
    }
}
