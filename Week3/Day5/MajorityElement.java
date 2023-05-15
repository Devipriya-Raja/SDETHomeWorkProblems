/*169. Majority Element
Easy
14.7K
443
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 time complexity - O(n) and the space complexity - O(1)

*/
package week3Day5Assignments;

import org.testng.annotations.Test;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		//Initialize the count
	    int count = 0;
	    //As there is majority element atleast length/2
	    int minCount=nums.length/2;
	    //Initialize elemnet as first in array
	    int element = nums[0];
	    //Loop the array 
	    for (int num : nums) {
	    	//Check if the num is equal to element
	        if (num == element) {
	        	//Increment the count if so
	            count++;
	            //If count is greater than minimun count return it .
	            if(count>minCount)
	        	    return num;
	          //If count is 0 element eual to num 
	        } else if (count == 0) {
	        	element = num;
	        	//Increment the count 
	            count++;
	          //If count is greater than minimun count return it .
	            if(count>minCount)
	        	    return element;
	        } else {
	            count--;
	        }
	    }
	    return element;
	}
	@Test
	public void printContainsDuplicate() {
		int[] nums={1,2,3,1,1,1,1};
		int[] nums0={0};
		System.out.println(majorityElement(nums));
		System.out.println(majorityElement(nums0));
		int[] nums1={1,0,1,10,1,0,2,0,1};
		System.out.println(majorityElement(nums1));
		int[] nums2={1,2,3,1,2,3,2,2,2,2};
		int[] nums3={1,2,3,1,2,3,2,3,3};
		System.out.println(majorityElement(nums2));
		System.out.println(majorityElement(nums3));
	}
}
