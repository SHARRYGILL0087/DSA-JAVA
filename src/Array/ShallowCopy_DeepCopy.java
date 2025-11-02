package Array;

import java.util.Arrays;

public class ShallowCopy_DeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] x = arr; // x is Shallow Copy of arr
        x[1] = 99; // Change the Original arr
        System.out.println(arr[1]);
        // Deep Copy
        int[] y = Arrays.copyOf(arr,arr.length); // BuiltIn method
//        int[] y = new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            y[i] = arr[i];
//        }
        System.out.println(y[2]);
        y[2] = 12; // Not Change the Original array
        System.out.println(arr[2]);
        System.out.println(y[2]);

    }
}
