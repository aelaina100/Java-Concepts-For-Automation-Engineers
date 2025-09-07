package A_Java_Programs_Basics;

/* In this array, print out the maximum number.
 *     2  4  5                             
 *     3  4 -7
 *     1  2  9      */                                   
                                                                                

public class L_maxArray_intervi {
	
	public static void main (String[] args)
	{
		int multi[][]= {{2,4,5}, {3,4,-7}, {1,2,9}};  
		int max= multi[0][0]; // Assuming that this is the maximum value
		
		for(int i=0; i<multi.length; i++)
		{
			for(int j=0; j<multi.length; j++)
			{
				if(multi[i][j] > max)
				{
					max= multi[i][j];
				}
			}
		}
		System.out.println("Maximum number is: " + max + " in this multidimensional array");
		
		
		
	}
	}
	
		
		
	


