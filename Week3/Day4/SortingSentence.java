/*1859. Sorting the Sentence
Easy
1.8K
55
Companies
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.

Time Complexity =  O(n log n)
Space Complexity = O(n)

*/
package week3Day4Assignments;


import org.testng.annotations.Test;

public class SortingSentence {
	public static String sortSentence(String s) {
		//Initialize the strings 
		String arrayAsString="";
		//Create String array to get the words 
	    String[] words = s.split(" ");
	    //Create String array to put the updated words
	    String[] result = new String[words.length];
	    //for each word in array get the number and using it , store the value in new array
	    for (String word : words) {
	        int index = Integer.parseInt(word.substring(word.length() - 1)) - 1;
	        result[index] = word.substring(0, word.length() - 1);
	    }
	   // return String.join(" ",result);
	    //print updated one 
	    for (int i = 0; i < result.length; i++) {
	    	arrayAsString += result[i] + " ";
        }
	    return arrayAsString;
	}
	@Test
	public void minDiff() {
		
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
		System.out.println(sortSentence("Myself2 Me1 I4 and3"));
}
}
