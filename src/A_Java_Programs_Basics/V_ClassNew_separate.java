package A_Java_Programs_Basics;

public class V_ClassNew_separate {
	
	// Examine this separate new file
	// This is another way of writing V_ClassA.java & V_ClassB.java in one .java class file.
	
	   static int value = 500;
       
			public static int random() // marking as static, deeming it only accessible in this class.
			{
				 int number = 3;
				 return value;  // ANY value could be returned. 
		     //  return 1000000;   // another value could be returned.
			}
			
			public static void main(String[] args) {
				
				int result= random()+6;   // accessed directly, without object creation, since it is marked as 'static'.
				System.out.println(result);	
					
			}
		}
			
	
	
		
		   
      


