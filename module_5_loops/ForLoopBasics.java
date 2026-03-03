package module_5_loops;

public class ForLoopBasics {
    public static void main(String[] args) {

        // Counting up
        for (int i = 1; i <= 5; i++) {
            System.out.println("Up: " + i);
        }

        // Counting down
        for (int i = 5; i >= 1; i--) {
            System.out.println("Down: " + i);
        }

        // Step by 2
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Step 2: " + i);
        }
    }
}
