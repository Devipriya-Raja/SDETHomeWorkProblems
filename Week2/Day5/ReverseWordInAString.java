/*557. Reverse Words in a String III
Easy
4.9K
226
Companies
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"

Time Complexity = O(n*m)
Space Complexity = O(n+m)
*/
 package week2Day5Assignments;

import org.testng.annotations.Test;

public class ReverseWordInAString {
	
	public String reverseWords(String s) {
		//Split the words and store in String array
	    String[] words = s.split(" ");
	    StringBuilder sb = new StringBuilder();
	    //For each word in words reverse the word and append 
	    for (String word : words) {
	        sb.append(reverseWord(word)).append(" ");
	    }
	    return sb.toString().trim();
	}

	private String reverseWord(String s) {
	    char[] chars = s.toCharArray();
	    //Initialize pointers for left and right and swap it 
        int left = 0, right = s.length() - 1;
	    while (left < right) {
	        char temp = chars[left];
	        chars[left] = chars[right];
	        chars[right] = temp;
	        //Increment the left pointer and decrement the right pointer
	        left++;
	        right--;
	    }
	    return new String(chars);
	}


	@Test
	public void printRemovedArray() {
		String s = "This is a Pen";
		System.out.println(reverseWords(s));
	}




}
