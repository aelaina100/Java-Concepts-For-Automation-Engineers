package overriding;

public class B_dog extends A_cat {

	public static void main(String[] args) {
		
		B_dog object= new B_dog();  
		// Above: The 2nd indispensible part of inheritance ( 1st is the 'extends' keyword). BOTH are needed.
		// 'object' will have an access to all methods/variables present in this dog class and in the cat class as well.
		object.orange();    // This is where overriding takes place
		
		
     // Below: in the case of-->
		A_cat ob= new A_cat(); // This ignores all inheritance aspects (Hence, Only accesses methods/variables present in the cat class ONLY)
		ob.orange();
		
		//SEPERATE BELOW
		// B_dog obj= new A_cat();  // Non-valid line of code. As  B_dog is NOT an interface.
		
	
	}
	
	// overriding the method of the inherited class
	public void orange()
	{
		System.out.println("This is an overriden method present in the dog class");
	}


}
