package InheritanceToRemoveBoilerPlateCodeWithTestNgAnnotation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// simply predict the outcome before running this program.
public class ps2 extends ps {
	
	  @Test
	   public void testRun()
	     {
	       doThis();
	     }
	     
	     @BeforeMethod()
	     public void statement()
	     {
	       System.out.println("run before each and every single method");
	     }
         
	     
	     @Test
		   public void gladiator()
		     {
	    	 System.out.println("some method named gladiator");
		     }
}
