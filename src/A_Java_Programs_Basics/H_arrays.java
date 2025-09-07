package A_Java_Programs_Basics;
//  A- Create an array that holds 5 values and print them out to the screen.

import org.testng.annotations.Test;

public class H_arrays {
	public static void main (String[] args)
	{
	
		int numbers[]= new int[5];
		numbers[0]= 10;
		numbers[1]= 11;
		numbers[2]= 22;
		numbers[3]= 33;
		numbers[4]= 44;
		// Now, the only way to print out the values stored in an array (Fixed-length data structure), is by looping through them.
		for(int i=0; i< numbers.length  ;i++)
		{
		   System.out.println(numbers[i]); 
		}
	
		System.out.println("######################################################################################################");
		
		// Another equally valid way of creating this array 
		// (and later printing out its values) is as follows:
		int values[]= {13,23,33,43,53};
		for(int i=0; i <values.length; i++)
		{
			System.out.println(values[i]);
		}
		System.out.println("######################################################################################################");
		
	//  B- Display the value stored at index 2 
		System.out.println("Value stored at index 2 is: ");
		System.out.println(values[2]);
			
		System.out.println("######################################################################################################");
	}
	//	 At which index is the value of 'some number' stored at ?  (Below it is the same question but for an array of strings).
		@Test
		public  void codingTest()
		{
			int numbers[]= {10,22,33,44,55};
			// at what index is the number 33 stored at ?
			int x=33;
			for (int i=0; i<numbers.length; i++)
			{
				if (numbers[i]==x)
				{
					System.out.println(x+ " has index of:" + i);
					break;
				}
				
				else if(i==numbers.length-1) //== if on the last iteration.
             // Now, controller will only execute what's between the brackets, if x isn't in the array 
					                        // as the last element underwent the above 'if' statement
					                         // that returned false.
					                         // made possible with the inclusion of the 'break' statement.
				{
					System.out.println(x + " does not exist in the array to start with");
				}
					
			}
			
		   }
		
		// At which index is the value of 'Omar' stored at ? 
		@Test
		public void practice()
		{
			String word[]= {"Ahmad", "Sami", "Omar"};
			
			String name= "Omar";
			for(int i=0; i<word.length; i++)
			{
				if(word[i].equalsIgnoreCase(name))
				{
					System.out.println(name + " is in the index of: " + i );
					break;
				}
				
				else if(i==word.length-1)   
				{
					System.out.println(name +" is not an element in this array");
				}
					
			}
		
		} }
	
		
		//Extremely important (July 8th,2024)==> Create a string array and convert its elements to small/capital characters and trim all spaces for all elements.
        	//Tip: Can only be done by converting the created array into an arraylist and then applying stream operations on the converted array list.
               // can also be done with regular Java code
			
	


