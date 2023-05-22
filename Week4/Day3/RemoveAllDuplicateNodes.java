/*203. Remove Linked List Elements
Easy
7.2K
209
Companies
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50

Time Complexity O(n)
Space Complexity O(1)



*/
package week4Day3Assignments;

import org.testng.annotations.Test;



public class RemoveAllDuplicateNodes {
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
		
		public void add(int data) {
	        Node newNode = new Node(data);
	        if (size==0) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	        size++;
	    }
	    
	    
}
	
	 public LinkedList.Node removeDuplicates(LinkedList.Node head,int val) {
		 RemoveAllDuplicateNodes.LinkedList remove = new RemoveAllDuplicateNodes.LinkedList();
		 //Create dummy Node
		 LinkedList.Node dummy = remove.new Node(0);
	        dummy.next = head;
	        //Create Node current
	        LinkedList.Node current = dummy;
	        
	        while (current.next != null) {
	            if (current.next.val == val) {
	                // Remove the node by skipping it
	                current.next = current.next.next;
	            } else {
	                // Move to the next node
	                current = current.next;
	            }
	        }
	        //return actual head
	        return dummy.next;
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
	    
	    RemoveAllDuplicateNodes remove = new RemoveAllDuplicateNodes();
	  LinkedList.Node head = list1.head;
	LinkedList.Node newHead = remove.removeDuplicates(head, 1);
	LinkedList.Node current = newHead;
    while (current != null) {
        System.out.print(current.val + " -> ");
        current = current.next;
    }
    System.out.print("null");
}
}

