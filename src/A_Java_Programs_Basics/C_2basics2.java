package A_Java_Programs_Basics;

 
// Revision Instructions: 
// Do not look at the method outside the main statement as of yet + go through this .java class line by line

public class C_2basics2 {

	public static void main(String[] args) {  
		
		C_2basics2  object= new C_2basics2 (); // creating an object of this .java class: only reason got to be is to access some method present
		                                        // in this .java class file which is, off course, outside this main statement.
		// becasue, again, in Java you can't create a method inside a method 
		  // But you can call a method from inside a method.
		
		object.validateResults(); //executes what's inside the brackets of the validateResults() method. AND
		// if the method returns a value (not void), then object.validateResults() = that value (but value not captured)
		
		int value= object.validateResults();  
		//  1- executes what's inside the validateResults() method   
		//  2- variable 'value' captures the int that validateResults() returns.
		// (write down that method with empty code inside its brackets)
		
		System.out.println(object.validateResults());
		//executes what's inside the brackets of the validateResults() method. AND
		// will display the value the validateResults() method returns (if its void, then nothing is displayed)
		System.out.println(value);

	}
	
	
	
	public int validateResults()
	{
		String word= "someText";
		System.out.println(" Programming fundementals");
		return 10;   
		//return "AbC"; // line valid as long as you change the method's return type to "String"
	}   //return "123"; // line valid as long as you change the method's return type to "String"


	}


