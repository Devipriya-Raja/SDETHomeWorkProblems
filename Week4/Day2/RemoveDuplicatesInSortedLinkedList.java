/*Remove Duplicates from Sorted List
Easy
7.3K
247
Companies
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:

 * 
 * 
 * 
 * 
 * Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.

 * Time Complexity O(n)
Space Complexity O(1)


 
 */
 package week4Day2Assignments;
import org.testng.annotations.Test;

public class RemoveDuplicatesInSortedLinkedList {
	public class LinkedList{
		private Node head=null;
	    private int size=0;

	    public class Node {
	        int val;
	        Node next;

	        public Node(int data) {
	            this.val = data;
	            this.next = null;
	        }
	    }
  	    
	    public boolean isEmpty() {
	    	return size==0;
	    }
	    public void add(int data) {
	    	Node newNode = new Node(data);
	    	if (isEmpty()) {
	            head = newNode;
	        } 
	    	else {
	        	Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	        size++;
	    }
	    
	    @Override
	    public String toString () {
	      StringBuffer sb = new StringBuffer();
	      sb.append("[");
	      Node current = head;
	      while (current != null) {
	        sb.append(current.val + ", ");
	        current = current.next;
	      }
	      sb.append("] --> " + size);
	      return sb.toString();
	    }
	    
	        }
	
public String removeDuplicates(LinkedList list) {
	//Make the list.head as currentNode
	LinkedList.Node currentNode = list.head;
	//If the head is null or the linked list has only one node
	if (currentNode == null || currentNode.next == null) {
		//Return that node
        return currentNode.toString();
    }
	//Iterate through the linked list while the current node and its next node are not null
	while (currentNode != null && currentNode.next != null) {
		//compare the value of the current node with the value of its next node
		if(currentNode.val==currentNode.next.val) {
			//If the values are equal,remove it by skipping 
			currentNode.next=currentNode.next.next;
		}
		//Move the current node to the next node
		currentNode=currentNode.next;
	}
	return list.toString();
}

@Test
public void removeDuplicatesTest() {
    
    LinkedList list1 = new LinkedList();
 
    list1.add(1);
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(3);
    list1.add(4);
    
    System.out.print(removeDuplicates(list1));
}
}
