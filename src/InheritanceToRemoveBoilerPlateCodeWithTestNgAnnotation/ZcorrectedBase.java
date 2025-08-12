package InheritanceToRemoveBoilerPlateCodeWithTestNgAnnotation;

import org.testng.annotations.BeforeMethod;

public class ZcorrectedBase {
	
	
	 @BeforeMethod()
     public void statement()
     {
       System.out.println("run before each and every single method");
     }
     
	
	public void doThis() 
	  {
	  System.out.println("I am here!");
	  }


}
