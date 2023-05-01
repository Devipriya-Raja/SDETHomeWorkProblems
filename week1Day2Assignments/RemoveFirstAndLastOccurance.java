/* Remove the first and last occurrence of a given number in the input array
input = {1,2,3,4,5,1}, number = 1
output = {2,3,4,5}

Time Complexity = O(n)
Space Complexity = O(n)
*/
package week1Day2Assignments;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RemoveFirstAndLastOccurance {
	
	public int[] removeFirstLastOccurrences(int[] array, int numberToBeRemoved) {
	    int n = array.length;
	    
	    // Count the number of occurrences of the given number
	    int count = 0;
	    for (int i = 0; i < n; i++) {
	        if (array[i] == numberToBeRemoved) {
	            count++;
	        }
	    }
	    
	    /*if(count>2)
	   // Create a new array with the correct size
		      int[] newArray = new int[n-2];
	    else
	    	int[] newArray = new int[n-count];*/
	    
	 // Create a new array with the correct size
	      int[] newArray = new int[n-2];
	    
	   // Copy the elements to the new array, skipping the first and last occurrences of the given number
		   // i=[1,2,3,1,4,5,1]
		     //k=[1,2,3,1,1,4,5]
      		//j=[0,1,2,3,4]
        //i++,j 0,0 (1,0) =>  1,0 (2,0) = > 2,1 (3,1 )=>  3,2 (1,2 )=>  4,3 ( 4,3) =>  5,4 (5,4 )
		      //k++,j 0,0 (1,0) => 2,0 = >3,1 => 1,2 => 1,2 => 4,3 =>5,4 
		      int j = 0;
		     boolean firstOccurrence = false;
		      // Check till count == 1 as its the last occurrence
		      while(count!=0) {
		      // Loop through the array and check each element		  		
		      for (int i = 0; i < n; i++) {
		    	  //If the array element is the number to be removed,skipping the first occurrence and decrement the count 
		          if (array[i] == numberToBeRemoved) {
		              if (count>1 && (!firstOccurrence)) {
		                  firstOccurrence = true;
		                  count--;
		                  continue;
		               //If the array element is the number to be removed after the first occurrence ,adding to new array and decrement the count 				          
		              } else if(count>1 && firstOccurrence) {
		            	  newArray[j] = array[i];
		            	  count--;
		            	  j++;
		              }
		              //If the array element is the number to be removed is last occurrence ,skipping the last occurrence and decrement the count 				          
		              else if(count==1) {
		            	  count--;
		            	  continue;
		              }
		          //If the array element is not the number to be removed , adding to new array  				          		                  
		          } else {
		        	  newArray[j] = array[i];
		        	  j++;
		        	  
		          }
		    	  }   
	    }
		      //input = {1,2,3,4,5,1}, number = 1
		    		 // output = {2,3,4,5}*/
		      System.out.println(Arrays.toString(newArray));
	    return newArray;
	}

	@Test
	public void printRemovedArray() {
		int[] input1 = {1,2,3,1,4,5,1};
		int number1 = 1;
		int[] input2 = {2,3,4,5};
		int number2 = 1;
		int[] input3 = {1,2,3,1,4,1,5,1};
		int number3 = 1;
		int[] input4 = {1,2,2,1,4,1,5,1};
		int number4 = 2;
		int[] input5 = {1,2,3,1,4,1,5,1};
		int number5 = 1;
		removeFirstLastOccurrences(input1,number1);
		removeFirstLastOccurrences(input2,number2);
		removeFirstLastOccurrences(input3,number3);
		removeFirstLastOccurrences(input4,number4);
		removeFirstLastOccurrences(input5,number5);

	}





}
