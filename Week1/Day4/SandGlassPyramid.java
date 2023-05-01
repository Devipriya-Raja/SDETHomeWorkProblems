 /*Sandglass Star Pattern
Enter the number of rows: 5

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
Time Complexity =  O(2(n^2)) 
Space Complexity = O(1)
 
 */
package week1Day4Assignments;

import org.testng.annotations.Test;

public class SandGlassPyramid {

	public void printSandGlassPyramid(int n) {
		// Loop through each row of the pyramid  
	    for(int i=n;i>=1;i--){
	    	//Loop through each column of the pyramid
            for(int j=1;j<=n;j++){
            if(j<=n-i)
            	//Print Space
               System.out.print(" ");
            else
            	//Print Asterisk
               System.out.print("* ");
            }
            System.out.println("");
        }
	 // Loop through each row of the pyramid
        for(int i=1;i<=n;i++){
        	//Loop through each column of the pyramid
            for(int j=1;j<=n;j++){
            if(j<=n-i)
            	//Print Space
               System.out.print(" ");
            else
            	//Print Asterisk
               System.out.print("* ");
            }
            System.out.println("");
        }
    }
				
				@Test
				public void printSandGlassPyramid() {
					printSandGlassPyramid(6);
					printSandGlassPyramid(8);
					printSandGlassPyramid(10);

					
				}

	}


