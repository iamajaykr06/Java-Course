package Module_6_Arrays;

public class ArraysBasics {

    public static void main(String[] args) {

        // 1 Declaration
        int[] arr1;

        // 2 Declaration + allocation
        int[] arr2 = new int[5];

        // 3 Direct initialization
        int[] arr3 = {10,20,30,40};

        // 4 Using new keyword with values
        int[] arr4 = new int[]{5,10,15};

        // 5 Default values
        int[] arr5 = new int[3];
        System.out.println("Default values:");
        for(int i=0;i<arr5.length;i++){
            System.out.println(arr5[i]);
        }

        // 6 Updating values
        arr2[0] = 100;
        arr2[1] = 200;

        // 7 Accessing element
        System.out.println("First element: " + arr3[0]);

        // 8 Length property
        System.out.println("Length: " + arr3.length);

        // 9 Traversing array
        System.out.println("Traversing arr3:");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i] + " ");
        }

    }

}