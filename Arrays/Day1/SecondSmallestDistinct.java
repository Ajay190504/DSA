import java.util.Scanner;

public class SecondSmallestDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int val = arr[i];

            if (val == first || val == second) continue;

            if (val < first) {
                second = first;
                first = val;
            } else if (val < second) {
                second = val;
            }
        }

        if (second == Integer.MAX_VALUE)
            System.out.println("Less than 2 distinct elements.");
        else
            System.out.println("Second Smallest (Distinct) = " + second);
    }
}