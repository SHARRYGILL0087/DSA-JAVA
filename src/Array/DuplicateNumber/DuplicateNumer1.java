package Array.DuplicateNumber;

public class DuplicateNumer1 {
    public static void main(String[] args) {
        // arr -> size n+1
        // consits ele -> 1 to n
        // 1 2 3 3 4
        // 1 2 3 4
        // Approach 1
        int[] arr = {1,2,3,4,5,6,7,5,8};
        int n = arr.length-1;
        // sum of n number
        int sum = n*(n+1)/2;
        int arrSum = 0;
        for (int ele : arr) arrSum +=ele;
        System.out.println(arrSum);
        System.out.println(sum);
        int ans = arrSum - sum;
        System.out.println(ans);

    }
}
