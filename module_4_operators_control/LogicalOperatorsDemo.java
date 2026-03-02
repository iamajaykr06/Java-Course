package module_4_operators_control;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {

        int age = 25;

        if (age > 18 && age < 60) {
            System.out.println("Working age");
        }

        if (age < 18 || age > 60) {
            System.out.println("Not working age");
        }

        boolean isLoggedIn = false;

        if (!isLoggedIn) {
            System.out.println("Please login");
        }
    }
}
