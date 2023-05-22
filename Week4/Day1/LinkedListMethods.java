/*Create and implement Single and Doubly linkedlist with below methods:
1. get(int index) - returns th eleement in the given index
Singly
Time Complexity = O(n)
Space Complexity =  O(1)
Doubly
Time Complexity = O(n)
Space Complexity =  O(1)

2. indexOf(int element) - return the index of the element or -1
Singly	
Time Complexity = O(n)
Space Complexity =  O(1)
Doubly
Time Complexity = O(n)
Space Complexity =  O(1)
*/		


package week4Day1Assignments;

import org.testng.annotations.Test;

public class LinkedListMethods {
	public class SinglyLinkedLists{
	private Node head = null;
	int size =0;
	
	class Node {
	    int val;
	    Node next;
	
	
	public Node (int data) {
		this.val=data;
		this.next=null;
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
	    
	    
	    public int getValue(int index) {
	    	//Initialize current
	    	Node current = head;
	    	
	    	if ( index < 0 || isEmpty() || current==null) {
	            return -1;
	        } 
	    	
	    	int count=0;
	    	//If current is not null and count is not equal to index
	    	 while (current != null && count != index) {
	    		 //Go to next node
	             current = current.next;
	             //Increment the count
	             count++;
	         }
	    	 if(current != null) {
	    	 return current.val;	
	    	 }
	    	 return -1;
	    }
        public int indexOf(int data) {
        	int index=0;
        	if (index < 0 || isEmpty()) {
	            return -1;
	        } 
	    	Node current = head;
	    	//loop if current is not null
	    	 while (current != null ) {
	    		 //if current.val is equal to data return that index
	    		 if( current.val == data) {
	    			 return index;
	    		 }
	    		// else go to next node
	    		 current = current.next;
	    		 //Increment the index
	    		 index++;
	         }
	    	 return -1;
	    	 
	    }
	    }
	class DoublyLinkedLists{
		private Node head = null;
		int size =0;
		
		class Node {
		    int val;
		    Node prev;
		    Node next;

		    Node(int val) {
		        this.val = val;
		        this.prev = null;
		        this.next = null;
		    }
		}
		
		boolean isEmpty() {
			return size==0;
		}
		
		public void add(int data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.prev = current;
	        }
	        size++;
	    }
		
		 public int getValue(int index) {
			//Initialize the current node
		    	Node current = head;
		    	//negative cases
		    	if (index < 0 || isEmpty() || current==null) {
		            return -1;
		        }
		    	
		    	int count=0;
		    	//If current is not null and count is not equal to index
		    	 while (current != null && count != index) {
		    		//Go to next node
		             current = current.next;
		             //Increment the count
		             count++;
		         }
		    	 //return current value if the current is not null
		    	 if (current != null) {
		             return current.val;
		         }
		    	 //return -1  if the current is null
		    	 return -1;
		    }
		 
		 public int indexOf(int data) {
	        	int index=0;
	        	if (index < 0 || isEmpty()) {
		            return -1;
		        } 
		    	Node current = head;
		    	//loop if current is not null
		    	 while (current != null ) {
		    		 //if current.val is equal to data return that index
		    		 if( current.val == data) {
		    			 return index;
		    		 }
		    		 //go to next node
		    		 current = current.next;
		    		 //Increment
		    		 index++;
		         }
		    	 return -1;
		    	 
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
@Test
public void singlyLinkedLists() {
LinkedListMethods.SinglyLinkedLists sll = new LinkedListMethods.SinglyLinkedLists();
sll.add(10);
sll.add(20);
sll.add(30);
sll.add(40);
sll.add(50);

LinkedListMethods.DoublyLinkedLists dll = new LinkedListMethods.DoublyLinkedLists();
dll.add(100);
dll.add(200);
dll.add(300);
dll.add(400);
dll.add(500);


System.out.println(dll.toString());
System.out.println(sll.getValue(2)); // Output: 30
System.out.println(sll.getValue(5));// Output: -1
System.out.println(sll.indexOf(40));  // Output: 3
System.out.println(sll.indexOf(60)); // Output: -1
System.out.println(dll.getValue(2));// Output: 300
System.out.println(dll.getValue(5));// Output: -1
System.out.println(dll.indexOf(400));// Output: 3
}}