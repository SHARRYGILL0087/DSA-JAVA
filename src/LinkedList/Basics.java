package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
    Node(){}
}

public class Basics {
    public  static  void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public  static  void display(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        display(head.next);
    }

    public static int get(Node head,int idx){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(i==idx) return temp.val;
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
    // 1 2 3 4 5
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        print(a);
//        display(a); // using recursions
        System.out.println(get(a,3));
    }
}
