package Array;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,9,10};
        int[] ans = merge(a,b);
        for (int ele : ans) System.out.print(ele+" ");
        System.out.println();
    }

    public static int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;

        // Merge both arrays until one ends
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements
        while (i < n) c[k++] = a[i++];
        while (j < m) c[k++] = b[j++];

        return c;
    }
}
