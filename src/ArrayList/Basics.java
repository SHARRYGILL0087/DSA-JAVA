package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(21);
        arr.add(23);
        arr.add(12);
        arr.add(10);
        arr.add(11);
        System.out.println(arr.get(2)); // arr[2]
        arr.set(2,50);  // arr[2] = 50;
        System.out.println(arr.get(2));
        System.out.println(arr); // print full list
        System.out.println(arr.size()); // arr.length
        int n = arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        // 21 23 50 10 11
//        arr.add(15);  // 21 23 50 10 11 15
        arr.add(2,15); // 21, 23, 15, 50, 10, 11
        n = arr.size();
        System.out.println(arr);
        arr.remove(n-1);
        Collections.reverse(arr); // reverse the array
        System.out.println(arr);
        n = arr.size();
        int i =0 , j = n-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);

    }
}
