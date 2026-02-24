import java.util.Scanner;

public class ThirdSmallestDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (n > 3): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (duplicates allowed):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int val = arr[i];

            // Skip duplicates
            if (val == first || val == second || val == third) {
                continue;
            }

            if (val < first) {
                third = second;
                second = first;
                first = val;
            } 
            else if (val < second) {
                third = second;
                second = val;
            } 
            else if (val < third) {
                third = val;
            }
        }

        if (third == Integer.MAX_VALUE) {
            System.out.println("Less than 3 distinct elements exist.");
        } else {
            System.out.println("Third Smallest (Distinct) = " + third);
        }
    }
}