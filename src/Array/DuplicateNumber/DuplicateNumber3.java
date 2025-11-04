package Array.DuplicateNumber;

public class DuplicateNumber3 {
    public static void main(String[] args) {
        // arr -> size n+1
        // consits ele -> 1 to n
        // 1 2 3 3 4
        // 1 2 3 4
        // Approach 3
        int[] arr = {1,2,3,4,5,6,7,5,8};
        int n = arr.length;
        int ans = -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]) ans = arr[i];
            }
        }
        if(ans!=-1) System.out.println(ans);
        else System.out.println("No Duplicate Found");

    }
}
