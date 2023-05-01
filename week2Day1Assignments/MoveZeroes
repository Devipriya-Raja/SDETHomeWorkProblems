/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Time Complexity =  O(n) 
Space Complexity = O(1)

*/

package week2Day1Assignments;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		// nums is null or nums is empty return nums
	    if(nums == null || nums.length == 0) {
	        return;
	    }
	    //Declare "slow" variable to maintain order
	    int slow = 0;
	    //Loop through each element and check whether its non zero
	    for(int fast = 0; fast < nums.length; fast++) {
	        if(nums[fast] != 0) {
	        	//swap the non zero to the front of the array
	            nums[slow] = nums[fast];
	            //Increment the variable
	            slow++;
	        }
	    }
	    //After completing the loop , forcefully change the remaining elements to zero 
	    while(slow < nums.length) {
	        nums[slow] = 0;
	        slow++;
	    }
	    //Print nums 
	    System.out.println(Arrays.toString(nums));
	}
	
	@Test
	public void moveZeroes() {
		//Input: nums = [0,1,0,3,12]
				//Output: [1,3,12,0,0]
		int[] nums = {0,1,0,3,12};
		int[] nums1 = {0,0,0,0,12};
		int[] nums2 = {4,1,6,3,12};
		moveZeroes(nums);
		moveZeroes(nums1);
		moveZeroes(nums2);

		
	}
}
