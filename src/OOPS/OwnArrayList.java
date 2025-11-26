package OOPS;

import java.util.ArrayList;

class Arraylist{
    int[] arr;
    int idx = 0;
    int size = 0;

    Arraylist(int capacity){
        arr = new int[capacity];
    }

    int capacity(){
        return  arr.length;
    }

    void add(int ele){
        if(idx==arr.length){ // Array got full
            int[] arr2 = new int[2*arr.length];
            for(int i=0;i<arr.length;i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx++] = ele;
        size++;
    }

    void add(int idx,int val){
        arr[idx] = val;
    }

    int get(int idx){
        return arr[idx];
    }

    void set(int idx,int val){
        arr[idx] = val;
    }

    void remove(){
        idx--;
        size--;
    }
    void remove(int index){

    }

    void display(){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

}

public class OwnArrayList {
    public static void main(String[] args) {
//        ArrayList brr = new ArrayList<>();


        Arraylist arr = new Arraylist(3);
        arr.add(1);
        arr.add(54);
        arr.add(9);
        System.out.println(arr.size);
        System.out.println(arr.get(2));
        arr.display();
        arr.add(23);

    }
}
