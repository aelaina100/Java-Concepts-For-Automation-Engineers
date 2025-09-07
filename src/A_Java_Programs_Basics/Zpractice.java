package A_Java_Programs_Basics;

public class Zpractice {

	public static void main(String[] args) {
	
/*1- Sum up the numbers contained within the following array.
 *     2  4  5                             
 *     3  4 -7
 *     1  2  9      */                                   
                                                                                
//2- For the minimum number in this array, find the maximum number in its column .
		
		int[][]multi= {{2,4,5},{3,4,-7},{1,2,9}};
		int minimum = multi[0][0];
		for(int i=0; i<multi.length; i++)
		{
			for(int j=0; j<multi[i].length; j++)
			{
				if (minimum > multi[i][j])
				{
					minimum = multi[i][j];
				}
			}
		}
		System.out.println("The mimimum element in this multi array is: "+ minimum);
		
	}
	
}
