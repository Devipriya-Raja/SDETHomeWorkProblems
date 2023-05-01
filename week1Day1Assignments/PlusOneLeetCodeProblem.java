/*https://leetcode.com/problems/plus-one/
 You are given a large integer represented as an integer array digits, where each digits[i] is the
  ith digit of the integer. The digits are ordered from most significant to least significant in 
  left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits. 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Time Complexity = O(n)
Space Complexity = O(n)
*/

package week1Day1Assignments;
import java.util.Arrays;

import org.testng.annotations.Test;
public class PlusOneLeetCodeProblem {
	
public static void plusOneForSmallerInteger(int[] n) {
	        //for smaller number only,this solution doesn't work for larger number 
	        int digits=0;
	        for(int i=0;i<n.length;i++){
	            digits=digits*10+n[i];
	            //return digits;
	            }
	            digits=digits+1;
	            String temp = Integer.toString(digits);
	            int[] newarray = new int[temp.length()];
	            for(int j=newarray.length-1;j>=0;j--){
	                //while (digits>0)
	            int digit = digits%10;
	            newarray[j]=digit;
	            digits = digits/10;
	            }
	            
	            System.out.println(Arrays.toString(newarray));
	        }

public static int[] plusOne(int digits[]) {
    int n = digits.length,count=0;
    
    // Start from the last digit and add one
    digits[n-1] += 1;
    
    // Add the carry till digit is not equal to 10 
    for (int i = n-1; i > 0 && digits[i] == 10; i--) {
    	count++;
        digits[i] = 0;
        digits[i-1] += 1;
    }
    
    // If the digit is 10, add another digit
    if (digits[0] == 10) {
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return newDigits;
    }
    
    System.out.println(Arrays.toString(digits));
    System.out.println(count);
    return digits;
}

@Test
public static void plusOneArray() {
	int[] n={5,6,9,9,9,9,9,9,9}; 
	int[] n1={5,0,9,9,4,9,9,9,7}; 
	plusOne(n);
	plusOne(n1);
}
	}


