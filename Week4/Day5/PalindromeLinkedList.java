/*234. Palindrome Linked List
Easy
13.9K
763
Companies
Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:
Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 

Follow up: Could you do it in O(n) time and O(1) space?
in java 

Time Complexity =  O(n)
Space Complexity = O(1)



*/
package week4Day5Assignments;

import org.testng.annotations.Test;
public class PalindromeLinkedList {
     int size=0;
	class ListNode {
	    int val;
	    ListNode next;
	  

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	    public boolean isPalindrome(ListNode head) {
	        if (head == null || head.next == null) {
	            return true;
	        }
	        //Initialize slow and fast
	        ListNode slow = head;
	        ListNode fast = head;
	        
	        // Find the middle of the linked list
	        while (fast.next != null && fast.next.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        
	        // Reverse the second half of the linked list
	        ListNode secondHalf = reverseLinkedList(slow.next);
	        
	        // Compare the first half with the reversed second half
	        ListNode firstHalf = head;
	        while (secondHalf != null) {
	            if (firstHalf.val != secondHalf.val) {
	                return false;
	            }
	            //Move both secondHalf and firstHalf pointers to next pointers
	            firstHalf = firstHalf.next;
	            secondHalf = secondHalf.next;
	        }
	        
	        return true;
	    }
	    
	    private ListNode reverseLinkedList(ListNode head) {
	        ListNode previous = null;
	        ListNode current = head;
	        
	        while (current != null) {
	            ListNode nextNode = current.next;
	            current.next = previous;
	            previous = current;
	            current = nextNode;
	        }
	        
	        return previous;
	    }
	    @Test
		public void PalindromeLinkedLists() {
	    
	    	ListNode head = new ListNode(3);
	    	head.next = new ListNode(2);
	    	head.next.next = new ListNode(2);
	    	head.next.next.next = new ListNode(3);
	    	System.out.println(isPalindrome(head));
	    	ListNode head1 = new ListNode(3);
	    	head1.next = new ListNode(2);
	    	head1.next.next = new ListNode(3);
	    	head1.next.next.next = new ListNode(3);
	    	System.out.println(isPalindrome(head1));
	       
	}
	}

