/* Remove the first and last occurrence of a given number in the input array
	input = {1,2,3,1,4,5,1}, number = 1
	output = {2,3,4,5}
	Time Complexity =  O(n) 
    Space Complexity = O(n)
*
	*/
	
package week1Day3Assignments;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RemoveAllOccurrence {
	
		public int[] removeallOccurrences(int[] array, int numberToBeRemoved) {
		    int n = array.length,count=0;
		    
		    // Count the number of occurrences of the given number
		   for (int i = 0; i < n; i++) {
		        if (array[i] == numberToBeRemoved) {
		            count++;      
		        }
		    }		    
		   // Create a new array with the correct size
			      int[] newArray = new int[n-count];
			   
		    
		   // Copy the elements to the new array, skipping the occurrences of the number to be removed
		          //int j=0;
			      // Loop through the array and check the element
			       // i=[1,2,3,1,4,5,1]
			        		//j=[0,0,0,0]
			          //i++,j 0,0 =>1,0=>2,0=>3,1=>4,2=>5,3=>6,3
			      for (int i = 0,j=0; i < array.length; i++) {
			          //skip the element if it is present in the array 
			   	  if (array[i] == numberToBeRemoved) {
			   	    continue;
			   	    }  
			      // if the number is not the value to be removed ,add it in new array
			   	  else {
			           newArray[j] = array[i];
			           j++;
			   	  }
			      }
			      //Print the newArray
			      System.out.println(Arrays.toString(newArray));
		    return newArray;
		}
		
		@Test
		public void printRemovedArray() {
			int[] input = {1,2,3,1,4,5,1};
			int number = 1;
			removeallOccurrences(input,number);
		}
		
}
