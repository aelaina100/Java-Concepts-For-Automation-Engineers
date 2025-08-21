package Inheritance_using_TestNG;

import org.testng.annotations.Test;

public class Pchild extends Parent{
	
	
	@Test
	public void execute()
	{
		// In TestNG, creating an object of the parent class is NOT imperative [This step is 'automatically performed' by TestNG]
		selenium();
		appium();
		restApi();
	}

	
	
}
