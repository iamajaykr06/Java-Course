package module_5_loops;

import java.util.Scanner;

public class DoWhileBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number greater than 0: ");
            number = sc.nextInt();
        } while (number <= 0);

        System.out.println("Valid input received.");
        sc.close();
    }
}