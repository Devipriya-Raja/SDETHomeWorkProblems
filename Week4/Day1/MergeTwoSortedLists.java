/*21. Merge Two Sorted Lists
Easy
18.2K
1.7K
Companies
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

Time Complexity O(n)
Space Complexity O(n)


*/
package week4Day1Assignments;

//import java.util.Arrays;

import org.testng.annotations.Test;

//import com.graphbuilder.struc.LinkedList;

public class MergeTwoSortedLists {
	public class LinkedList {
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
	      Node current = head.next;
	      while (current != null) {
	        sb.append(current.val + ", ");
	        current = current.next;
	      }
	      sb.append("] --> " + size);
	      return sb.toString();
	    }
	    
	        }
	
	      public LinkedList.Node mergeTwoLists(LinkedList list1 , LinkedList list2) {
	     // public String mergeTwoLists(LinkedList.Node node1 , LinkedList.Node node2) {
	    	  //Initialize the node1 and node2
	    	  LinkedList.Node node1 = list1.head;
	          LinkedList.Node node2 = list2.head;
	    	//LinkedList mergedList = new LinkedList();
	        // Create a new LinkedList
	    	MergeTwoSortedLists.LinkedList merge = new MergeTwoSortedLists.LinkedList();
	    	//mergedList.head = merge.new Node(-1);
	    	//mergedList.head = mergedList.new Node(0);
	    	//LinkedList.Node currentNode=mergedList.head;
	    	//Create a dummy node
	    	LinkedList.Node head =merge.new Node(0);
	    	//Initialize the currentNode;
	    	LinkedList.Node currentNode =head;
	    	
	        while (node1 != null && node2 != null) {
	        	//Compare the values of node1 and node2
	            if (node1.val < node2.val) {
	            	//If node1 value is less than node2 value, set currentNode.next to node1
	            	currentNode.next = node1;
	            	//Move to next node
	            	node1 = node1.next;
	            } else {
	            	//Else node2 value is less than node1 value, set currentNode.next to node2
	            	currentNode.next = node2;
	            	//Move to next node
	            	node2 = node2.next;
	            }
	          //Move to next node
	            currentNode = currentNode.next;
	        }
	        //check if node1 is still not null ,if it is not null, set currentNode.next to node1,else node1 is null, set currentNode.next to node2
	        currentNode.next = node1 != null ? node1 : node2;
	        
	        //return mergedList.toString();
	        //return mergedList.head.next;
	        //return the actual head
	        return head.next;
	    }
	    
	@Test
	public void mergeTwoListsTest() {
        
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list2.add(1);
        list2.add(3);
        list2.add(4);
     
         MergeTwoSortedLists merge = new MergeTwoSortedLists();
        //System.out.print(mergeTwoLists(node1, node2));
        
        LinkedList.Node mergedNode = merge.mergeTwoLists(list1, list2);
        System.out.print("[");
        while (mergedNode != null) {        	
            System.out.print(mergedNode.val+",");
            mergedNode = mergedNode.next;
        }
        System.out.print("]");
	}	

}