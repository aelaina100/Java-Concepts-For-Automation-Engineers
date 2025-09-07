package A_Java_Programs_Basics;

/*1- In this array, print out the minimum number.
 *     2  4  5                             
 *     3  4 -7
 *     1  2  9      */                                   
                                                                                


public class K_min_array_interview {
	
	public static void main (String[] args)
	{
		int multi[][]= {{2,-9,5}, {3,4,-7}, {1,2,9}};  
		int min= multi[0][0]; // Assuming that this is the minimum value
		
		for(int i=0; i<multi.length; i++)
		{
			for(int j=0; j<multi[i].length; j++)    // condition: j<multi.length works. Investigate
			{
				if(multi[i][j] <min)
				{
					min= multi[i][j];
				}
			}
		}
		
		System.out.println("Minimum number is: " + min + " in this multidimensional array");
	} 
	 }
	
		
		
	


