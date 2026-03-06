package Module_6_Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input loop

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int search =-1;

        // Iterate Over an Array And update search If key is Found

//        for(int i=0;i<n;i++){
//            if(arr[i]==key){
//                search=i;
//                break;
//            }
//        }
//
        // Iterate right to left and returns the last occurrence

        for (int i = n-1; i >=0; i--) {
            if (arr[i] == key) {
                search = i;
                break;
            }
        }

        System.out.println(search);
    }

}