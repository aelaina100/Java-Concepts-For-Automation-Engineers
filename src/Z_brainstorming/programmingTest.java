package Z_brainstorming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class programmingTest {
	
	
	
	

	@Test
	public void practice11()
	{
		/*Check Palindrome Array
		Write a program to check if an array is a palindrome. Example:
		Input: [1, 2, 3, 2, 1]
		Output: true  */
		
		 ArrayList<Integer> originalNumbers= new ArrayList<>(Arrays.asList(1,2,3,2,1));
		
		ArrayList<Integer> arraylist_numbers= new ArrayList<Integer>();
		for(int i=originalNumbers.size()-1; i>=0;i--) {
			arraylist_numbers.add(arraylist_numbers.get(i));
		}
		
		// covert the original array above into an arrayList so both can be compared.
		
		// ArrayList<Integer> originalNumbers= new ArrayList<>(Arrays.asList(numbers)); WON'T work. hence
		// instead of declaring at the top 	int numbers[]= {1,2,3,2,1}; the below line was declared: 
		
		
		
		if(originalNumbers.equals(arraylist_numbers))
		{
			System.out.println("The given array is a palindrome");
		}
		
		else {
			Assert.assertTrue(false, "The given array is NOT palindrome");
		}
		
		
		
		
	}
	
	
	@Test(enabled=false)
	public void practice10()
	{
		/*Write a program to rotate an array to the right by a given number of steps. Example:
           Input: [1, 2, 3, 4, 5], Rotate by 2
           Output: [4, 5, 1, 2, 3]
		 */
	}
	
	
	@Test(enabled=false)
	public void practice9()
	{
		/*
		 * Second Largest Element
           Write a program to find the second largest element in an array. */
		   int numbers[]= {4,67,2,-250,-1000};
		 
	}
	
	
	@Test(enabled=false)
	public void practice8()
	{
		/* IMPORTANT
		 *  6. Frequency of Elements
            Write a program to count the frequency of each element in an array. Example:
            Input: [1, 2, 2, 3, 4, 4, 4]
            Output: 1: 1, 2: 2, 3: 1, 4: 3
		 * 
		 */
		int numbers[]= {1, 2, 2, 3, 4, 4, 4};
		
			
		}
	
	@Test(enabled=false)
	public void practice7()
	{
		/*
		 *Search an Element
         *Write a program to search for an element in an array and return its index. If the element is not found, display a message.
		 */
		String x[]= {"Adam", "Sara", "Fareed"};
		String wanted= "Fareedyy";
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i].equalsIgnoreCase(wanted))
			{
				System.out.println("The index of: " + wanted + " is: " +i);
				break;
			}
			
			else if(i==x.length-1){  // Controller will execute what's inside the brackets if the wanted item is not in the array 
				                     // to start with
				System.out.println("The item of: " + wanted +" is NOT in the array");
			}
				
			}
		}
		
	
	
	@Test(enabled=false)
	public void practice6()
	{
		 /* Count Even and Odd Numbers
          * Write a program to count the number of even and odd numbers in an array of integers.*/
		 int values[]= {1,3,88,7,4};
		 
		 int evenCount = 0;
		 int oddCount  = 0;
		 for(int i=0; i<values.length; i++)
		 {
			 if(values[i]%2==0) {
				 evenCount++; 
			 }
			 else {
				 oddCount++;
			 }
		 }
		 System.out.println("Count of even numbers is:" + evenCount);
		 System.out.println("Count of odd numbers is:" + oddCount);
	}
	
	
	@Test(enabled=false)
	public void pratcie5() {
		/*  Reverse an Array
            Write a program to reverse the elements of an array without using an additional array  */
	 
		String words[]= {"Learning", "Automation", "QA"};	
	}
	
	
	@Test(enabled=false)
	public void practice4()
	{
		/*  Reverse an Array
            Write a program to reverse the elements of an array.
		 */
		String words[]= {"Learning", "Automation", "QA"};
		ArrayList<String> arraylist= new ArrayList<String>();
		
		for(int i=words.length-1; i >= 0 ;i--)
		{
		arraylist.add(words[i]);
		}
		System.out.println(arraylist); //will print out with brackets []. For an array (fixed-length data structure), only looping,
	    //arraylist.toArray()  // In case you want to convert this arrayList into an array.
	}

	
	@Test(enabled=false)
	public void practice3() {
		/* . Find Maximum and Minimum
        Write a program to find the minimum value in an array of integers.*/
		
		int numbers[]= {4,67,2,-250,-1000};
		int minimum= numbers[0]; 
		
		for(int value: numbers)
		{
			if (value<minimum) 
			{
				minimum=value; 
			}
		}
        
		System.out.println("Minimum number in the array is: "+ minimum);
		
	}
	
	

		@Test(enabled=false)
		public void practice2()
		{
			/* . Find Maximum and Minimum
                 Write a program to find the maximum value in an array of integers.*/
			     
			int numbers[]= {2,4,6,155,3};  // I want to find the maximum number
			int maximum = numbers[0]; 
			for(int i=0; i<numbers.length; i++)
			{
				if(numbers[i]>maximum)
				{
					maximum= numbers[i];
				}
			}
			System.out.println("Maximum number in the array is: " + maximum);
			
		}
	
	
		
		@Test(enabled=false)
		public void practice1()
		{
			/* Sum of Elements
			Write a program to take an array of integers as input and calculate the sum of all elements in the array. */
			int numbers[]= {2,6,8,4};
			
			int sum=0;
			for(int i=0; i<numbers.length; i++)
			{
				sum= sum + numbers[i];
			}
			System.out.println(sum);
		}

}
