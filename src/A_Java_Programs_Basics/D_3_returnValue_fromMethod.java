package A_Java_Programs_Basics;

public class D_3_returnValue_fromMethod {
	
	/*
	public static void Main (String [] args)
	{
		
		
	        int number=2;
		    updateIntValue();
	        
	        System.out.println(number); 
			
	}

	private static void updateIntValue() { 
	            int number1 =3;
	            System.out.println(number1); 
	              
	      // Question:  How can you make the [system.out.println()], in the main statement (where execution begins), display value of number1  ?
	} */
	
	//Solution:
	
	public static void main (String [] args)  
	{
		
	        int number=2;
		    int value= updateIntValue();
		    
	        System.out.println(value);  // or simply the argument of "updateIntValue()".
	                                    // In both cases, all line(s) of code in side the method is/are going to be executed.
			
			}

	private static int updateIntValue() { 
	              int number1 =4;           // For later, how about declaring an array instead ? & maybe r eturning the summed up value ?
	              //System.out.println(number1);   
	              return number1;
	                                    }
	
}
