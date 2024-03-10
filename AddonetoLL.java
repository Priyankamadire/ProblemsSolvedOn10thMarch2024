/**Problem statement
You're given a positive integer represented in the form of a singly linked-list of digits. The length of the number is 'n'.



Add 1 to the number, i.e., increment the given number by one.



The digits are stored such that the most significant digit is at the head of the linked list and the least significant digit is at the tail of the linked list.



Example:
Input: Initial Linked List: 1 -> 5 -> 2

Output: Modified Linked List: 1 -> 5 -> 3

Explanation: Initially the number is 152. After incrementing it by 1, the number becomes 153.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
3
1 5 2


Sample Output 1:
1 5 3


Explanation For Sample Input 1:
Initially the number is 152. After incrementing it by 1, the number becomes 153.


Sample Input 2:
2
9 9


Sample Output 2:
1 0 0


Explanation For Sample Input 2:
Initially the number is 9. After incrementing it by 1, the number becomes 100. Please note that there were 2 nodes in the initial linked list, but there are three nodes in the sum linked list.


Expected time complexity :
The expected time complexity is O('n').


Constraints:
1 <= 'n' <=  10^5
0 <= Node in linked list <= 9

There are no leading zeroes in the number.

Time Limit: 1 sec
 */
import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/

public class AddonetoLL {
	public static Node addOne(Node head) {
		// Write your code here.
		head = rev(head);
		Node t = head;
		int car =1;
		while(t!=null){
			t.data=t.data+car;
			if(t.data<10){
				car=0;
				break;
			}
			else{
				t.data=0;
				car=1;
			}
			t=t.next;
		}
		if(car==1){
			Node nn = new Node(1);
			head = rev(head);
			nn.next=head;
			return nn;
		}
		head=rev(head);
		return head;

    }

    public static Node rev(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node nn = rev(head.next);
        Node t = head.next;
        t.next = head;
        head.next = null;
        return nn;
    }
}