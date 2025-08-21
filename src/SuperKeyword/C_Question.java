package SuperKeyword;
import org.testng.annotations.Test;

// currently this entire .java class is trash. Check for later versions in the repository
public class C_Question extends E_Question {
	/* Question:
	 * 
	 * 
	@Test
	public void testRun()
	{
		int a= 3;
	}
	
	 * 
	 * For the 'a' value present above in the testRun() method, 
	 * feed it to the multiply() function present in 'D_Question.java' 
	 * and display the result 
	 * 
	 * Do it WITHOUT object creation 
	 * 	--> There are 2 types of Object creation:
	 *      A- Create an object of the D_Question class in TestNg method & use it to access the multiply() method
	 *         . But, this requires the multiply() method to be parameterized (Against the condition):
	 *           D_Question ob=  new D_Question();
	 *           ob.multiply(a) 
	 *           
	 *      B- You Create an object of the D_Question class in here and parameterize it with a raw value 'a'
	 *         .This implies that one has to create a construcor in the D_Question class. These 2 actions
	 *          hand over the 'a' value defined in this class onto the D_Question class
	 *          by using this.a= a; (This global variable a defined in D_Question class, now equals the 
	 *          carried over/transported 'a' from this class named C_Question.
	 *          But, again- This problem instructs you to find an alterantive solution.
	 *           
	
     *
     *Solution: The solution is provided in [E_Question.java]:
     *          1- Extend (Inhertit from) this class "C_Quesion.java"
     *          2- In the [E_Question.java] use the 'Super' keyword, so that the 'a' defined
     *             in the parent class is used instead of the one defined in the child class.
     *
     *
     */
   @Test
    public void testRun()
      {
	    int a= 3;
	    System.out.println(multiply());
	    
      }
}
