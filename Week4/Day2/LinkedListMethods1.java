/*Create and implement Single and Doubly linkedlist with below methods
1. lastIndexOf(int element) - return the index of the element or -1
2. addAll(LinkedList list, int index) - add the new List to the existing List at specific index
Singly
Time Complexity O(n)
Space Complexity O(1)

Time Complexity O(n)
Space Complexity O(1)

Doubly
Time Complexity O(n) - Can be O(1)?
Space Complexity O(1)

Time Complexity O(n)
Space Complexity O(1)
*/


package week4Day2Assignments;

import org.testng.annotations.Test;



public class LinkedListMethods1 {
	class SinglyLinkedLists{
           private Node head=null;
           int size=0;
           
           class Node{
           int val;
           Node next;
           
           public Node(int data) {
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
   	 
           public int lastIndexOf(int element) {
           int index = -1;
           Node current = head;
           int currentIndex = 0;

           while (current != null) {
               if (current.val == element) {
                   index = currentIndex;
               }
               current = current.next;
               currentIndex++;
           }

           return index;
       }
           public void addAll(SinglyLinkedLists list,int index) {
        	   if(index<0 || index>size) {
        		   throw new IndexOutOfBoundsException("Invalid index");
        	   }
        	   if(list==null || list.size==0) {
        	   return;
        	   }
        	   Node listHead=list.head;
        	   if(head==null) {
        		   head=listHead;
        	   }
        	   else {
        		   if(index==0) {
        			   //list.getLastNode().next = head;
                       head = listHead;
                       list.getLastNode().next = head;
        		   }
        		   else {
        			  Node previous = getNode(index - 1);
                       Node current = previous.next;
        			  //Node current = getNode(index);
                       list.getLastNode().next = current;
                       //current = listHead;
                       previous.next = listHead;
                       //list.getLastNode().next = current;
                   }
        		   }
        	   size+=list.size;
        	   
           }
           public Node getNode(int index) {
        		   if (index < 0 || index >= size) {
        	            throw new IndexOutOfBoundsException("Invalid index");
        	        }

        	        Node current = head;
        	        for (int i = 0; i < index; i++) {
        	            current = current.next;
        	        }
        	        return current;
        	    }
           
           public Node getLastNode() {
    	        Node current = head;
    	        while(current.next!=null)
    	            current = current.next;
    	        return current;
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
	
	class DoublyLinkedLists{
        private Node head=null;
        private Node tail=null;
        int size=0;
        
        class Node{
        int val;
        Node next;
        Node prev;
        
        public Node(int data) {
     	   this.val=data;
     	   this.next=null;
     	  this.prev=null;
        }
}
        public void add(int data) {
	        Node newNode = new Node(data);
	        if (head==null) {
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
        public int lastIndexOf(int element) {
            int index = -1;
            Node current = head;
            int currentIndex = 0;

            while (current != null) {
                if (current.val == element) {
                    index = currentIndex;
                }
                current = current.next;
                currentIndex++;
            }

            return index;
        }
        public void addAll(DoublyLinkedLists list,int index) {
     	   if(index<0 || index>size) {
     		   throw new IndexOutOfBoundsException("Invalid index");
     	   }
     	   if(list==null || list.size==0) {
     	   return;
     	   }
     	   Node listHead=list.head;
     	   Node listTail = list.tail;
     	   if(head==null) {
     		   head=listHead;
     		   tail=listTail;
     	   }
     	   else {
     		   if(index==0) {
     			   //list.getLastNode().next = head;
                    head = listHead;
                    head.prev = listTail;
                    //listTail.next = head;
                    list.getLastNode().next = head;
     		   }
     		   else {
     			  Node previous = getNode(index - 1);
                    Node current = previous.next;
     			  //Node current = getNode(index);
                    list.getLastNode().next = current;
                    //previous.next = listHead;
                    previous.next = listHead;
                    listHead.prev = previous;
                    //list.getLastNode().next = current;
                }
     		   }
     	   size+=list.size;
     	   
        }
        public Node getNode(int index) {
 		   if (index < 0 || index >= size) {
 	            throw new IndexOutOfBoundsException("Invalid index");
 	        }

 	        Node current = head;
 	        for (int i = 0; i < index; i++) {
 	            current = current.next;
 	        }
 	        return current;
 	    }
    
    public Node getLastNode() {
	        Node current = head;
	        while(current.next!=null)
	            current = current.next;
	        return current;
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
	LinkedListMethods1.SinglyLinkedLists sll = new LinkedListMethods1.SinglyLinkedLists();
	sll.add(10);
	sll.add(20);
	sll.add(30);
	sll.add(40);
	
	 //int index = sll.lastIndexOf(40);
    // System.out.println("Index of 40: " + index); // Output: Index of 30: 4
     LinkedListMethods1.SinglyLinkedLists list = new LinkedListMethods1.SinglyLinkedLists();
     list.add(50);
     list.add(60);
     list.add(70);
     
     sll.addAll(list, 2);
     System.out.println("Updated SinglyLinkedList: " + sll.toString());

	}
	@Test
	public void doublyLinkedLists() {
		LinkedListMethods1.DoublyLinkedLists dll = new LinkedListMethods1.DoublyLinkedLists();
		
		 int index = dll.lastIndexOf(40);
	     System.out.println("Index of 40: " + index); // Output: Index of 30: 4
	     LinkedListMethods1.DoublyLinkedLists list = new LinkedListMethods1.DoublyLinkedLists();
	     list.add(50);
	     list.add(60);
	     list.add(70);
	     
	     dll.addAll(list, 0);
	     System.out.println("Updated DoublyLinkedLists: " + dll.toString());

		}
}

