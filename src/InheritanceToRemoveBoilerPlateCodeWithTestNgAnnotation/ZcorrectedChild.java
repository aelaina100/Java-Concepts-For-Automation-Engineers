package InheritanceToRemoveBoilerPlateCodeWithTestNgAnnotation;
import org.testng.annotations.Test;

//1- simply predict the output before running this program.
//2- How does the output compare to the one outputed by ps2.java (An interview question)
public class ZcorrectedChild extends ZcorrectedBase {
	
	@Test
	   public void testRun()
	     {
	       doThis();
	     }
	     
	    
	     
	     @Test
		   public void gladiator()
		     {
	    	 System.out.println("some method named gladiator");
		     }

}
