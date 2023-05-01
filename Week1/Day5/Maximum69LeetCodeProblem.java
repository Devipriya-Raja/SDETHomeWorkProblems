/*https://leetcode.com/problems/maximum-69-number/
You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

Example 1:

Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
Time Complexity =  O(n) 
Space Complexity = O(n)
*/

package week1Day5Assignments;

import org.testng.annotations.Test;

public class Maximum69LeetCodeProblem {
	
	public static int maximum69Number (int num) { 
		//Convert the integer to Char Array
		char arr[]=String.valueOf(num). toCharArray(); 
		//Loop through each element to check if which digit is first !9
		for(int i=0;i<arr.length;i++) {
		// If first !9 change it to 9 and break the loop 
	       if(arr[i]!='9') {
		     arr[i]='9'; 
		     break;
	       }
	     }
	return Integer.parseInt(String.valueOf(arr));
	}
	@Test
	public static void printmaximum69Number() {

		System.out.println(maximum69Number(9669));
		System.out.println(maximum69Number(6669));
		System.out.println(maximum69Number(9999));
		System.out.println(maximum69Number(9969));
		System.out.println(maximum69Number(6666));
}

}
