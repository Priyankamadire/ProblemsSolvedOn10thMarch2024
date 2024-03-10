/**Problem statement
You’re given a linked list. The last node might point to null, or it might point to a node in the list, thus forming a cycle.



Find out whether the linked list has a cycle or not, and the length of the cycle if it does.



If there is no cycle, return 0, otherwise return the length of the cycle.



Example:
Input: Linked List: 4 -> 10 -> 3 -> 5 -> 10(at position 2)

Output: Length of cycle = 3

Explanation: The cycle is 10, 3, 5.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
4
4 10 3 5
2
Sample Output 1:
3
Explanation Of Sample Input 1 :
The cycle is 10, 3, 5.
Sample Input 2 :
4
4 10 3 5
0
Sample Output 2 :
0
Explanation Of Sample Input 2 :
Since ‘p’ = 0, the last node is pointing to null, so no cycle exists.


Constraints:
1 <= ‘n’ <= 100000
1 <= Data in linked list node <= 10^9
0 <= ‘p’ <= ‘n’
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
 };

 *****************************************************************/
import java.util.*;
public class LengthOfLoopBruteForce
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        Node temp = head;
        HashSet<Node> hs = new HashSet<>();
        while(temp!=null){
            if(!hs.contains(temp)){
                hs.add(temp);
            }
            temp=temp.next;
        }
        return hs.size();
    }
}