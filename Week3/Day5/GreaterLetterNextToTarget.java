/*744. Find Smallest Letter Greater Than Target
Easy
2.9K
2K
Companies
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

Time Complexity = O(log n)
Space Complexity = O(1)*/
package week3Day5Assignments;

import org.testng.annotations.Test;

public class GreaterLetterNextToTarget {
	 public void greaterLetterNextToTarget(char[] letters, char target) {
		//Initialize the variable
	        int n = letters.length;
	        int low = 0, high = n - 1;
	        while (low <= high) {
	        	// calculate middle index
	            int mid = low + (high - low) / 2;
	            // if target is greater, search right half
	            if (letters[mid] <= target) {
	            	low = mid + 1;
	            // if target is smaller, search left half
	            } else {
	            	high = mid - 1;
	            }
	        }
	        //if low is inside length print letters[low]
	        if(low<n) 
	            System.out.println(letters[low]);
	        //else print letters[0] as default
	        	else
	        		System.out.println(letters[0]);
	    }
	
@Test
public void greaterLetterNextToTarget() {
	char[] chars={'c','f','j'};
	char[] chars1={'x','x','y','y'};
	greaterLetterNextToTarget(chars,'a');
	greaterLetterNextToTarget(chars,'c');
	
	greaterLetterNextToTarget(chars1,'z');
}
}
