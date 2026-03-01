package GettingStarted;

public class TypeCasting {
    public static void main(String[] args) {

        int a = 10;
        double b = a;  // implicit casting

        double x = 9.8;
        int y = (int) x;  // explicit casting

        System.out.println("Implicit: " + b);
        System.out.println("Explicit: " + y);
    }
}
