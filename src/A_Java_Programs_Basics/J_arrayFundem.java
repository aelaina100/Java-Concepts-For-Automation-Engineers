package A_Java_Programs_Basics;
// 1- Sum up the numbers contained within the following array.
// 2- print out the number at the index of '3'
// 3- print out the index, at which number 5 is at

public class J_arrayFundem {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,7};
		int sum=0;
		int length_array= a.length;
		
		for(int i=0; i<length_array; i++) 
		{
			sum=sum+a[i];

		}
//1-
  System.out.println(" The sum of the array is: " +sum);
//2-
  System.out.println(" In the array, number '5' is at the index of: " + a[3]     );
//3-
  int wanted = 5;
  for(int b=0; b<a.length; b++)
	{
		if(a[b]==wanted)
		{
			System.out.println("The index is: " + b + " for the wanted number: " + wanted);
			break;
		}
		else if(b==a.length-1)
		{
			System.out.println("NOT found- The wanted number: "+ wanted + " isn't "
							+ "in the array to start with.");
		}
	}
} }






	