package ForEach_Loop;

public class forEach {
    public static void main(String[] args) {
        // Use to transverse Data Structure
        // cannot modify array elements
        int[] arr = {4,64,73,12,42};
        for(int ele : arr){
            // ele is a copy of elements of arr
            System.out.print(ele + " ");
        }
    }
}
