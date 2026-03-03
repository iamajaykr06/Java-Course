package module_5_loops;

import java.util.Scanner;

public class LargestOfN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {

            int current = sc.nextInt();

            maxValue = Math.max(current, maxValue);
        }
        System.out.println(maxValue);
    }
}