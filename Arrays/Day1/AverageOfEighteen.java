import java.util.Scanner;

public class AverageOfEighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[18];
        int sum = 0;

        System.out.println("Enter 18 integers:");

        for (int i = 0; i < 18; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / 18;

        System.out.println("Average = " + average);
    }
}