/*Print the below Pyramid 
Pyramid Program
    * 
   * * 
  * * * 
 * * * * 
* * * * *

Time Complexity = O(n^2)
Space Complexity = O(1)
	*/

package week1Day1Assignments;

import org.testng.annotations.Test;

public class PyramidProblem {
	
	// Declare variable n
	public void printPyramid(int n) {
     // Loop through each row of the pyramid
     for(int i=1;i<=n;i++){
    	// Loop through each column of the pyramid
         for(int j=1;j<=n;j++){
        // Print spaces before the first asterisk
         if(j<=n-i)
            System.out.print(" ");
        // Print asterisks
         else
            System.out.print("* ");
         }
         // Move to the next row
         System.out.println("");
     }
 }
	@Test
	public void printPyramid() {
		printPyramid(6);
		printPyramid(8);
		printPyramid(10);

		
	}
	
}

