/*35. Search Insert Position
Easy
13.2K
576
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

TIme Complexity = O(log n)
SpaceComplexity =O(1)

*/
package week3Day3Assignments;

import org.testng.annotations.Test;

public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
		//Initialize the variable
	    int n = nums.length;
	    int low = 0, high = n-1;
	 // calculate middle index
	    while (low <= high) {
	        int mid = (low + high) / 2;
	     // check if target is found
	        if (nums[mid] == target) {
	            return mid;
	         // if target is greater, search right half
	        } else if (nums[mid] < target) {
	            low = mid + 1;
	         // if target is smaller, search left half
	        } else {
	            high = mid - 1;
	        }
	    }
	    
	    return low;
	}
	@Test
	public void printRemovedArray() {
		int[] input = {1,3,5,6};
		System.out.println(searchInsert(input,5));
		int[] input1 = {1,3,5,6,8,10};
		System.out.println(searchInsert(input1,7));
		int[] input2 = {1,3,5,6};
		System.out.println(searchInsert(input2,7));
	}
	}
