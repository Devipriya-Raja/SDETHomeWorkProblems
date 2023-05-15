/*1876. Substrings of Size Three with Distinct Characters
Easy
1.1K
30
Companies
A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.

 

Example 1:

Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

Time Complexity =  O(n-k) for subString method O(n-k*k) for other methods
Space Complexity = O(1) for subString method O(k) for other methods

*/
package week3Day1Assignments;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class SubstringsSizeThreeDistinctCharacters {
	public int subString(String s) {
		//Initialize the count
	   int count=0;
	   //Loop for length - 3 and get the char
	   for(int i = 0; i <= s.length() - 3; i++) {
		     char c1 = s.charAt(i);
		     char c2 = s.charAt(i + 1);
		     char c3 = s.charAt(i + 2);
		     //Compare and if not same , increment the count
		     if (c1 != c2 && c1 != c3 && c2 != c3) 
		        count++;
		 }
	   return count;
	}
	
	public int subStringWithTarget(String s,int k) {
		  //Initialize the count
		   int count=0,added=0;
		   //create set as it contains no duplicates
		   Set<Character> set = new HashSet<>();
		   //Loop to get the subarray anf loop inside the subarray to check whether its having duplicates
		   for(int i = 0; i <= s.length() - k; i++) {
			   String substring=s.substring(i, i+k);
			   for (char c : substring.toCharArray()) {
				   //if no duplicates its added and Increment the added
			        if (set.add(c)) {
			        	added++;
			        }
			       //System.out.println(added);
			 }
			   //If added equal to 3 then no duplicates so we are incrementing the count 
			   if(added== k)
				   count++;
			   //reset the set to check next subarray
			   set.clear();
			   //reset the added 
			   added=0;
		}
		  
		   return count;
	}
	
	public int subStringWithTarget1(String s,int k) {
		   int count=0;
		   for(int i = 0; i <= s.length() - k; i++) {
			   String substring=s.substring(i, i+k);
			   if(isDistinctCharacters(substring))
				   count++;
		}
		  
		   return count;
	}
	
	public static boolean isDistinctCharacters(String s) {
	    Set<Character> set = new HashSet<>();
	    for (char c : s.toCharArray()) {
	        if (!set.add(c)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	@Test
	public void printRemovedArray() {
		String input = "xyzzaz";
		System.out.println(subString(input));
		String input1 = "aababcabc";
		System.out.println(subString(input1));
		System.out.println(subStringWithTarget(input,3));
		System.out.println(subStringWithTarget(input1,3));
		System.out.println(subStringWithTarget1(input,3));
		System.out.println(subStringWithTarget1(input1,3));
	}
}
