/*Create and implement Single and Doubly linkedlist with below methods
1. removeFirst() - remove first element in the List
2. removeLast() - remove last element in the List
SinglyLinkedList
 removeFirst()
 Time Complexity: O(1)
 Space Complexity: O(1)
 removeLast
 Time Complexity: O(n)
 Space Complexity: O(1)
 DoublyLinkedList
 removeFirst()
 Time Complexity: O(1)
 Space Complexity: O(1)
 removeLast
 Time Complexity: O(n) (can be O(1))
 Space Complexity: O(1)
 
*/
package week4Day3Assignments;

import org.testng.annotations.Test;


public class RemoveFirstAndLast {
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
	    public LinkedList.Node removeFirst() {
	//Return null if its empty
	    	if (isEmpty()) {
	            return null;
	        } 
	    	//else make head as new head
	            Node newHead= head.next;
	            head = newHead;
	            size--;
	            return newHead;
	    }
	    
	    public LinkedList.Node removeLast() {
	    	
	    	if (isEmpty()) {
	            return null;
	        } 
	    	if (head.next == null) {
                head = null;
                size = 0;
                return null;
            }
	    	    Node current = head;
	    	    //Traverse till before last is not null
	        	while(current.next.next!=null) {
	            current= current.next;
	        	}
	        	//Make last before next as null 
	        	current.next= null;
	        	size--;
	            return head;
	    }
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
		    
		  list1.removeFirst();
		  list1.removeLast();
		
		LinkedList.Node current = list1.head;
	    while (current != null) {
	        System.out.print(current.val + " -> ");
	        current = current.next;
	    }
	    System.out.print("null");
	}
}
