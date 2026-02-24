import java.util.Scanner;

public class SumOfTwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];
        int sum = 0;

        System.out.println("Enter 20 integers:");

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}