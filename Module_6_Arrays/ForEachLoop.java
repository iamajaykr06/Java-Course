package Module_6_Arrays;

public class ForEachLoop
{
    public static void main(String args[])
    {
        int[] arr = {5, 3, 2, 4, 1};

        int key = 2;

        boolean found = false;
        // Check whether the given key value is present inside my array

        for(int num:arr){
             if(num==key)
             {
                 found=true;
                 break;
             }
        }

        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}