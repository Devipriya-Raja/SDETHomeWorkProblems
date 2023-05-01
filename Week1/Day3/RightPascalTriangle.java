/*
 * 
 *  Right Pascal’s Triangle
Enter the number of rows: 5

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
Time Complexity =  O(2(n^2)) 
Space Complexity = O(1)

 */
package week1Day3Assignments;

import org.testng.annotations.Test;

public class RightPascalTriangle {
	
	public void printHalfDiamond(int n) {
	    
    int count=0;
 // Loop through each row of the pyramid
        for(int i=1;i<=n;i++){
            count++;
          //Loop through each column of the pyramid to print Asterisk
            for(int j=1;j<=i;j++){
                count++;
               System.out.print("*");
            }
            System.out.println("");
        }
     // Loop through each row of the pyramid
        for(int i=n-1;i>=1;i--){
            count++;
            //Loop through each column of the pyramid to print Asterisk
            for(int j=1;j<=i;j++){
                count++;
               System.out.print("*");
            }
            //new line
            System.out.println("");
        }
        System.out.println(count);
    }
			
			@Test
			public void printHalfDiamond() {
				printHalfDiamond(6);
				printHalfDiamond(8);
				printHalfDiamond(10);

				
			}

}
