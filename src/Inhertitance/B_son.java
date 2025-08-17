package Inhertitance;

public class B_son extends A_Grandfather  {
	// Note: Java does not support multiple inheritance (Ex:'B_son' class can only extend the 'A_Grandfather'one only or the 'C_grandSon' one only)
		// So if you want, in this class, to ALSO access the methods/variables contained in the other class (C_grandSon),
		 // then let the 'A_Grandfather' class extend the 'C_grandSon' one.

	public static void main(String[] args) {
		
		B_son s= new B_son(); //Continuing the inheritance aspect (Should be able to access all methods present in this class & the one inherited (A_Grandfather)
		s.city();
		s.country();
		System.out.println(s.z);
		s.activities();		
		
		//seperate:
		/*
		  
		 A_Grandfather  ob= new A_Grandfather ();   // this ignores the inheritance aspect.
		 
             // Hence  "ob" will only access the methods and the variable available ONLY in A_Grandfather, 
            
            
		 ob.city();
		 ob.country();
		 System.out.println(ob.z);
		
		*/
	}
	
	public void activities()     
	{
		System.out.println(" here is activities() method inside SON class");
	}
	
	
			
			
}
