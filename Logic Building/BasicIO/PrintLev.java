// Read age, print adult/minor.
import java.util.Scanner; 

public class PrintLev{

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            if (age < 18) {
                System.out.println("You are a minor.");
            } else {
                System.out.println("You are an adult.");
            }
        }
    }
}