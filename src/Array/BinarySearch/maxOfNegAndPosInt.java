package Array.BinarySearch;

public class maxOfNegAndPosInt {
    public static int maximumCount(int[] arr) {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        int neg = 0 , pos = -1;
        // Finding last idx of neg numbers
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]<0){
                neg = mid;
                lo = mid + 1;
            }
            else hi = mid-1;
        }
        // Finding first idx of pos numbers
        lo = 0;
        hi = n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>0){
                pos = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        System.out.println(pos);
        System.out.println(neg);
        if(pos==-1) return  neg+1;
        if(neg==-1) return  (n-1)-pos+1;
        int nop = (n-1)-pos+1;
        int non = neg+1;
        System.out.println(nop);
        System.out.println(non);

        return Math.max(nop,non);

    }

    public static void main(String[] args) {
        int[] arr = {-2,-1,-1,0,0,0};
        System.out.println( maximumCount(arr));
    }
}
