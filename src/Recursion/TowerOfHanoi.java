package Recursion;

public class TowerOfHanoi {

    public static void hanoi(int n, char src, char hpr, char dest){

        if(n==0) return;
        // n-1 disks from A to B via C
        hanoi(n-1,src,dest,hpr);
        // larget from A to C
        System.out.println(src + "->" + dest);
        // n-1 disks from B to C via A
        hanoi(n-1,hpr,src,dest);
    }

    public static void main(String[] args) {
    hanoi(3,'A','B','C');
    }
}
