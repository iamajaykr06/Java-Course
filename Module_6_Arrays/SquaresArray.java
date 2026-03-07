package Module_6_Arrays;

import java.util.Scanner;

public class SquaresArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i * i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
