//Read radius, print area (πr²).

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double radius = scanner.nextDouble();
            
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circle with radius " + radius + " is: " + area);
        }
    }
}