/*Diamond Shape Pattern Program
Enter the number of rows: 5

     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
Time Complexity O(n^2)
Space Complexity O(1)

*/
package week1Day2Assignments;

import org.testng.annotations.Test;

public class DiamondProblem {

		// Declare variable n,count
		public void printDiamond(int n) {
    int count=0;
 // Loop through each row of the pyramid
    for(int i=1;i<=n;i++){
        count++;
     // Loop through each column of the pyramid to print spaces
        for(int j=1;j<=n-i;j++){
            count++;
           System.out.print(" ");
        }
     // Loop through each column of the pyramid to print Asterisk
        for(int j=1;j<=2*i-1;j++){
            count++;
           System.out.print("*");
        }
        System.out.println("");
    }
 // Loop through each row of the pyramid
    for(int i=n-1;i>=1;i--){
        count++;
     // Loop through each column of the pyramid to print spaces
        for(int j=1;j<=n-i;j++){
            count++;
           System.out.print(" ");
        }
     // Loop through each column of the pyramid to print Asterisk       
        for(int j=1;j<=2*i-1;j++){
            count++;
           System.out.print("*");
        }
        System.out.println("");
    }
    System.out.println(count);
}
		
		@Test
		public void printDiamond() {
			printDiamond(6);
			printDiamond(8);
			printDiamond(10);

			
		}
}

