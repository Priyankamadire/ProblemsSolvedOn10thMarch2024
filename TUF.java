import java.util.*;
class Node {
        int num;
        Node next;
        Node(int val) {
            num = val;
            next = null;
        }
}
class TUF{
//utility function to insert node at the end of the linked list
static Node insertNode(Node head,int val) {
    Node newNode = new Node(val);
    
    if(head == null) {
        head = newNode;
        return head;
    }
    
    Node temp = head;
    while(temp.next != null) temp = temp.next;
    
    temp.next = newNode;
    return head;
}

//utility function to check presence of intersection
/*
static Node intersectionPresent(Node head1,Node head2) {
     HashSet<Node> st=new HashSet<>();
    while(head1 != null) {
       st.add(head1);
       head1 = head1.next;
    }
    while(head2 != null) {
        if(st.contains(head2)) return head2;
        head2 = head2.next;
    }
    return null;

}*/
static int intersectionPresent(Node head1,Node head2) {
   if(head1==null || head2==null){
    return -1;
   }
   Node t1 = head1;
   Node t2 = head2;
   while(t1!=t2){
    t1=t1.next;
    t2=t2.next;
    if(t1==t2){
        return t1.num;
    }
    if(t1==null){
        t1=head2;
    }
    if(t2==null){
        t2=head1;
    }
   }

   return t1.num;

}



//utility function to print linked list created
static void printList(Node head) {
    while(head.next != null) {
    System.out.print(head.num+"->");
        head = head.next;
    }
    System.out.println(head.num);
}

public static void main(String args[]) {
    Node head = null;
    head=insertNode(head,1);
    head=insertNode(head,3);
    head=insertNode(head,1);
    head=insertNode(head,2);
    head=insertNode(head,4);
    Node head1 = head;
    head = head.next.next.next;
    Node headSec = null;
    headSec=insertNode(headSec,3);
    Node head2 = headSec;
    headSec.next = head;
    System.out.print("List1: "); printList(head1);
    System.out.print("List2: "); printList(head2);
    
    System.out.println("The intersection point is "+intersectionPresent(head1,head2));
    
}
}