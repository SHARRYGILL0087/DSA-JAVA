package Array.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,6,7,3};
        mergesort(arr);
        for (int ele : arr) System.out.print(ele + " ");
    }

    private static void mergesort(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        // Step 1 : create two arrays of size n/2
        int[] a = new int[n/2] ; int[] b  = new int[n-n/2];
        // Step 2 : Copy-paste array to a and b
        int idx = 0;
        for(int i=0;i<a.length;i++) a[i] = arr[idx++];
        for(int i=0;i<b.length;i++) b[i] = arr[idx++];
        // Step 3 : Magic
        mergesort(a);
        mergesort(b);
        // Step 4 : Merge 'a' and 'b' into arr
        Merge(a,b,arr);
    }

    public static void Merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }

        while (i<a.length) c[k++] = a[i++];
        while (j<b.length) c[k++] = b[j++];

    }
}
