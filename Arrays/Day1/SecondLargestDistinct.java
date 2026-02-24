import java.util.Scanner;

public class SecondLargestDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = arr[i];

            if (val == largest || val == second) continue;

            if (val > largest) {
                second = largest;
                largest = val;
            } else if (val > second) {
                second = val;
            }
        }

        if (second == Integer.MIN_VALUE)
            System.out.println("Less than 2 distinct elements.");
        else
            System.out.println("Second Largest (Distinct) = " + second);
    }
}