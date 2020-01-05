package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Length:");
        int length = input.nextInt();
        System.out.println("Enter The Width:");
        int width = input.nextInt();
        System.out.println("Area of Rectangle: " + (length*width));
    }
}
