/*https://leetcode.com/problems/remove-element/
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Time Complexity =  O(n) 
Space Complexity = O(1)
*/

package week2Day2Assignments;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveElementUsingNoExtraSpace {
	public static int RemoveElement(int[] nums,int numberToBeRemoved,int[] expectedNums) {
		// nums is null or nums is empty return 0
	    if(nums == null || nums.length == 0) {
	        return 0;
	    }
	  //Declare "slow" variable to maintain order
        int slow=0;
      //Loop through each element and check whether its numberToBeRemoved
		for(int fast=0;fast<nums.length;fast++) {
			//If its not numberToBeRemoved
			if(nums[fast]!=numberToBeRemoved) {
				//Swap
				nums[slow]=nums[fast];
				//Increment the slow as its maintained the order
				slow++;
			}
		}
		System.out.println(Arrays.toString(nums));
		//get the elements into expectedNums
		 int i=0;
		 while( i < slow) {
			 expectedNums[i] = nums[i];
			 i++;
		    }
		 System.out.println(Arrays.toString(expectedNums));
	        //Assert 
		 Assert.assertEquals(slow, expectedNums.length);
		 Assert.assertEquals(Arrays.copyOf(nums, slow), expectedNums);
		return slow;
		
	}
	
	@Test
	public static void RemoveElementUsingNoExtraspace() {
		int[] nums = {3,2,2,3};
		int[] expectedNums = new int[2];
		int val = 3;
		int[] nums1 = {0,1,2,2,3,0,4,2}; 
		int val1 = 2;
		int[] expectedNums1 = new int[5];
		System.out.println(RemoveElement(nums,val,expectedNums));
		System.out.println(RemoveElement(nums1,val1,expectedNums1));
	}
	}

