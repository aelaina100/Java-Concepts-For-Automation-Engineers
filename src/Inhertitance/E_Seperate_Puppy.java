package Inhertitance;

public class E_Seperate_Puppy extends D_Separate_Dog  {

	public static void main(String[] args) {
		
		dog(); // Accessing a method in the parent class directly as it is 'static' (Without the need to create an object of this "E_Seperate_Puppy" class.)

		E_Seperate_Puppy ob= new E_Seperate_Puppy (); // continuing the 2nd aspect of inheritance in order to access a non-static method present 
		ob.monster();                                     // in the parent class.
		
	}

}
