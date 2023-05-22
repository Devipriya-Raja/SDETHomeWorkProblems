/*206. Reverse Linked List
Easy
17.9K
328
Companies
Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []

Time Complexity O(n)
Space Complexity O(1)


*/
package week4Day4Assignments;

import org.testng.annotations.Test;


public class ReverseLinkedList {
	  private Node head=null;
      int size=0;
	class Node {
	    int val;
	    Node next;

	    Node(int val) {
	        this.val = val;
	    }
	}
	public void add(int data) {
	    	Node newNode = new Node(data);
	    	if (head==null) {
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
	

	    public Node reverseList(Node head) {
	    	//Initialize two pointers previous and current
	    	Node previous = null;
	    	Node current = head;
	    	//While the current pointer is not null
	        while (current != null) {
	        	//Create a temporary variable called nextNode
	        	Node nextNode = current.next;
	        	//Reverse the pointer of the current node by setting its next pointer to the previous node
	            current.next = previous;
	            //Move the previous and current pointers to next.
	            previous = current;
	            current = nextNode;
	        }
            //return the head
	        return previous;
	    }
	    
	    @Test
		public void ReverseLinkedLists() {
	    ReverseLinkedList sll = new ReverseLinkedList();
		sll.add(10);
		sll.add(20);
		sll.add(30);
		sll.add(40);

		Node head = sll.head;
		 Node reversedHead = sll.reverseList(head);
	        System.out.print("[");
	        while (reversedHead != null) {        	
	            System.out.print(reversedHead.val);
	            if (reversedHead.next != null) {
	            	System.out.print(", ");
	            }
	            reversedHead = reversedHead.next;
	        }
	        System.out.print("]");
	}
}


