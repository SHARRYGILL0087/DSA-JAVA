package String;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    public static int sumList(List<Integer> ans){
        int sum = 0;
        for(int ele : ans){
            sum+=ele;
        }
        return sum;
    }

    public static int Subsetsum(int[] arr,List<Integer> ans,int idx,List<List<Integer>> List){
        if(idx==arr.length){
            System.out.print(ans+" ");
            int sum = sumList(ans);
            System.out.print(sum+" ");
            List.add(ans);
            return 1;
        }
        int num = arr[idx];
        List<Integer> newAns = new ArrayList<>(ans);
        newAns.add(num);
        return Subsetsum(arr,newAns,idx+1,List) + Subsetsum(arr,ans,idx+1,List);

    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4};
        List<List<Integer>> List = new ArrayList<>();
        List<Integer> ans  = new ArrayList<>();
        int res =  Subsetsum(arr,ans,0,List);
//        System.out.println(res);
//        System.out.println(List);
    }
}
