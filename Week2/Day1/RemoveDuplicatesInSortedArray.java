/* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Time Complexity =  O(n) 
Space Complexity = O(1)
*/

package week2Day1Assignments;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RemoveDuplicatesInSortedArray {
	public int removeDuplicatesInSortedArray(int[] nums) {
		// nums is null or nums is empty return 0
	    if(nums == null || nums.length == 0) {
	        return 0;
	    }
	    //Declare "slow" variable to maintain order
	    int slow = 0;
	  //Loop through each element and check whether its duplicate
	    for(int fast = 1; fast < nums.length; fast++) {
	    	//If not duplicate , Increment slow and swap
	        if(nums[fast] != nums[slow]) {
	            slow++;
	            nums[slow] = nums[fast];
	        }
	        }
	    //slow's length = index+1
	    int k = slow+1;
	 /*// Initialize empty String array of the same length as the integer array
	    String[] stringArr = new String[nums.length];

	    // Loop through each element of the integer array and convert to String
	    for (int i = 0; i < nums.length; i++) {
	    	stringArr[i] = String.valueOf(nums[i]);
	    }
	    int numberOfDuplicates=slow+1;
	    while(numberOfDuplicates < stringArr.length) {
	    	stringArr[numberOfDuplicates] = "_";
	        numberOfDuplicates++;
	    }*/
	  //Print nums 
	    System.out.println(Arrays.toString(nums));
	    return k;
	}
	@Test
	public void removeDuplicatesInSortedArray() {
		//Input: nums = [1,1,2]
				//Output: [1,2,1]
		int[] nums = {1,1,2};
		int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
		int[] nums2 = {1,2,3};
		
		System.out.println(removeDuplicatesInSortedArray(nums));
		System.out.println(removeDuplicatesInSortedArray(nums1));
		System.out.println(removeDuplicatesInSortedArray(nums2));

}
}
