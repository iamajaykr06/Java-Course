package module_5_loops;

public class BreakAndContinueDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;  // skip 5
            }

            if (i == 8) {
                break;  // stop at 8
            }

            System.out.println(i);
        }
    }
}