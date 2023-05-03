/*A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

 

Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: s = "III"
Output: [0,1,2,3]

Time Complexity =  O(n) 
Space Complexity = O(n)	*/
package week2Day3Assignments;


import java.util.Arrays;

import org.testng.annotations.Test;

public class DIStringMatchLeetCodeProblem {

	public String dIStringSolution(String s) {
		//Declare the variable for I as 0 and D as s.length()
		int low=0,high=s.length();
		//Cteate a new int array with size 1 plus the length of the string
		int[] output = new int[s.length()+1];
		//Loop through the array till s.length()-1
		 for(int i=0;i<s.length();i++) {
			 //if I keep on increasing 1 for each loop
			 if(s.charAt(i)=='I')
				 output[i]+=low++;
			 else 
				//if D keep on decreasing 1 for each loop
				 output[i]+=high--;
		 }
		 //for last one forcefully put as current low 
		 output[s.length()]=low;
		 return Arrays.toString(output);
	}
	@Test
	public void dIStringSolution() {
	String s="III";
	String s1="DDD";
	String s2="IDIDID";
	String s3="IDD";
	System.out.println(dIStringSolution(s));
	System.out.println(dIStringSolution(s1));
	System.out.println(dIStringSolution(s2));
	System.out.println(dIStringSolution(s3));
}
}