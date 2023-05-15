/*2418. Sort the People
Easy
877
14
Companies
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

 

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.

TIme Complexity :O(nlogn)
Space Complexity :O(n)


*/
package week3Day3Assignments;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import org.testng.annotations.Test;

public class SortPeople {
	public String sortPeople(String[] names, int[] heights) {
		//BruteForce
	    int n = names.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (heights[i] < heights[j]) {
	                // Swap the heights
	                int temp = heights[i];
	                heights[i] = heights[j];
	                heights[j] = temp;
	                // Swap the names
	                String tempName = names[i];
	                names[i] = names[j];
	                names[j] = tempName;
	            }
	        }
	    }
	    return Arrays.toString(names);
	}
	
	    public String sortThePeople(String[] names, int[] heights) {
	    	//Create Map to store names and its corresponding heights
	        Map<Integer, String> heightAndName = new HashMap<>();
	        for (int i = 0; i < names.length; i++) {
	        	heightAndName.put(heights[i], names[i]);
	        }
	        //Sort the array by heights 
	        Arrays.sort(heights);
	        //Create the String array with length of names
	        String[] sortedNames = new String[names.length];
	        //find the last index
	        int index = names.length - 1;
	        //loop for length of heights
	        for (int i = 0; i < heights.length; i++) {
	        	//sort in descending order
	            sortedNames[index] = heightAndName.get(heights[i]);
	            index--;
	        }
	        
	        return Arrays.toString(sortedNames);
	    }

	@Test
	public void mainMethod() {
	String[] names = {"Mary","John","Emma"};
	int[] heights = {180,165,170};
	System.out.println(sortPeople(names,heights));
	String[] names1 = {"Mary","John","Emma","Raja"};
	int[] heights1 = {180,165,170,185};
	System.out.println(sortPeople(names1,heights1));
	System.out.println(sortThePeople(names,heights));
	System.out.println(sortThePeople(names1,heights1));
}
}
