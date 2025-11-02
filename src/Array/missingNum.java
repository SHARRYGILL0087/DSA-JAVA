package Array;

import java.util.Scanner;

public class missingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter eles : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(missingNum(arr));
    }

    public static int sum(int n ){
        int sum = 0;
        for(int i=1;i<=n+1;i++){
            sum += i;
        }
        System.out.println("Sum :"+sum);
        return sum;
    }

    public static int missingNum(int arr[]) {
        int n = arr.length;
        int sum = sum(n);
        int arrSum = 0;
        for(int i=0;i<n;i++){
            arrSum +=arr[i];
        }
        int ans  = sum - arrSum;
        return ans;
    }
}
