/*Sort Array By Parity
Easy
4.3K
135
Companies
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Time Complexity =  O(n) 
Space Complexity = O(1)
*/
package week2Day4Assignments;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortArrayByParity {
	public static void sortArray(int[] nums) {
		//Declare the variables
	int left=0, temp=0,right=nums.length-1;
	//Loop through the given length
	while(left<right) {
		//if left is even, go to next (increment) as its already even 
		if(nums[left]%2==0) 
			left++;		
		//else if right is odd, go to next (decrement) as its already odd 
		else if(nums[right]%2==1) 
			right--;	
		//else swap the right and the left and go to next element (both increment and decrement)
		else{
			temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}
	System.out.println(Arrays.toString(nums));
	}
	@Test
	public static void sortArray() {
		int[] nums = {70,1,2,13,12,90};
		int[] nums1 = {5,0,10,15,12,11};
		int[] nums2 = {4,1,6,3,12};
		sortArray(nums);
		sortArray(nums1);
		sortArray(nums2);
}
}
