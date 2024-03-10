/**Problem statement
Given a singly linked list of 'N' nodes. The objective is to determine the middle node of a singly linked list. However, if the list has an even number of nodes, we return the second middle node.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
5
1 2 3 4 5
Sample Output 1 :
3 4 5
Explanation Of Sample Input 1 :

We can clearly see that there are 5 elements in the linked list therefore the middle node is the node with value '3'.
Sample Input 2 :
6
1 2 3 4 5 6
Sample Output 2 :
4 5 6
Explanation Of Sample Input 2 :

We can clearly see that there are 6 elements in the linked list and the middle nodes are  nodes with values 3 and 4 hence we return a second middle node having value '4'.
Constraints :
1 <= 'N' <= 10^4
0 <= 'data' <= 10^3 

Where 'N' is the length of the linked list.

Time Limit: 1 sec
 */
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class FindMiddleOfLL
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        int n = len(head);

        int a = (int)n/2;
        int k = a+1;
        Node temp = head;
        
        while(temp!=null){
            k=k-1;
            if(k==0){
                break;
            }
            temp=temp.next;
        }
        return temp;

    }
    public  static int len(Node head){
        Node t = head;
        int len = 0;
        while(t!=null){

            len++;
            t=t.next;
        }
        return len;
    }
}