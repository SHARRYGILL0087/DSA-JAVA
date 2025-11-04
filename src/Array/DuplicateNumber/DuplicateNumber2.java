package Array.DuplicateNumber;

public class DuplicateNumber2 {
    public static void main(String[] args) {
        // arr -> size n+1
        // consits ele -> 1 to n
        // 1 2 3 3 4
        // 1 2 3 4
        // Approach 2
        int[] arr = {1,2,3,4,5,6,7,2,8};
        int n = arr.length;
        int ans = -1;
        boolean[] brr = new boolean[n+1];
        for(int ele : arr){
            if(brr[ele] == false) brr[ele] = true;
            else {
                ans = ele;
                break;
            }
         }
        if(ans!=-1) System.out.println(ans);
        else System.out.println("No Duplicate Found");

    }
}
