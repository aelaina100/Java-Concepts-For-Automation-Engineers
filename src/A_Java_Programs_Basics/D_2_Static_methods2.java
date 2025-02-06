package A_Java_Programs_Basics;
import org.testng.annotations.Test;

public class D_2_Static_methods2 {
	
	@Test  // or The plain by-default Java compiler instead. Does NOT make a difference for accessing other method(s) from here.
	public void D_write()
	{
		System.out.println("Write method !");
		
		F_findOut(); 
		//Accessing this method directly without creating an object. ONLY possible cuz it's labeled as 'static' PLUS is IN this.java class file.
		//Also, accessing method 'F_findOut' via object will still work (Buy why bother if 'static' is used). 
		
		D_2_Static_methods2  d= new D_2_Static_methods2 ();  // Creating an object of this class to access the E_explore() method that's inside it.
		d.E_explore(); // output: "This is an explanatory method" & return value is contained. To use it check out the below line.
		
		System.out.println("*********************************************");
		
		String returned= d.E_explore(); 
		// outcome: Prints out "This is an exploratory method" PLUS 'returned' stores value of "This text is being returned"
		System.out.println("Returned value is: " + returned);	
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(language());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		String x= language();
		System.out.println(x);
	}
	
	
	
	public String E_explore()
	{
		System.out.println("This is an exploratory method");
		return "This text is being returned";
	}
	
	
	public static void F_findOut() 
	{
	// Adding 'static' keyword to method declaration, renders
	// such method accessible without creating an object of the class in which this method is present.
    // [PLUS: this static method is ONLY accessible in the .java class file it's present in].
	// All other methods that are not assigned the 'Static' keyword, can ONLY be accessed via object creation. 
	
		System.out.println("Findout method");
	}	 
	
	public static String language()
	{
		System.out.println("Learning languages !");
		return "French";
	}
	
}
