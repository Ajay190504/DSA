import java.util.Scanner;

public class ThirdLargestDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = arr[i];

            if (val == first || val == second || val == third) continue;

            if (val > first) {
                third = second;
                second = first;
                first = val;
            } 
            else if (val > second) {
                third = second;
                second = val;
            } 
            else if (val > third) {
                third = val;
            }
        }

        if (third == Integer.MIN_VALUE)
            System.out.println("Less than 3 distinct elements.");
        else
            System.out.println("Third Largest (Distinct) = " + third);
    }
}