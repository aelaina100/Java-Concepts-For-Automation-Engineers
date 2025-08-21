package s_ThisKeyword;

import org.testng.annotations.Test;

public class C_demo {
	
	/*  //Commented out on purpose as it is a question !:---> 
	 
	@Test
	public void testRunQuestion()
	{
		int a = 9; 
		// Now, use the increment function present in the next .java class file "D_demo.java" for
		 // incrementing the 'a' value on the line above.
		  // keep in mind that that increment() function is not to have any argument (not parameterized) as
		   // a condition for solving this question.
	}
     */ 
	
	/* Solution:
	 * The only solution in this case is via creating a parameterized object (with the value of 'a' in here) 
	 * of the other class (which means that one has to create its corresponding constructor in the other class)
	 * so that 'a' here is carried over to that other class and made as the value
	 * of any 'a' in that other class [By stating: this.a =a; meaning: this global a in the other class
	 * now equals tha carried over 'a' which is the one initialized in this class.
	 * 
	 */
	@Test
	public void testRun()
	{
		int a = 9; 

		E_demo object= new E_demo(a); 
		System.out.println(object.increment());
		System.out.println(a);// what will be the output ?
		
		
	}
}
