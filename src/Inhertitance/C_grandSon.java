package Inhertitance;

public class C_grandSon extends B_son {

	public static void main(String[] args) {
		
		C_grandSon gs= new C_grandSon();  // continuing the inheritance aspect.
		                                       // Should be able to access all methods present:
		                                         // 1- in this class 
		                                         // 2- in the one inherited from (B_son)
		                                        //  3- in class (A_Grandfather), since its extended by (B_son).
		                               
		
		gs.activities();    // the only method contained within the 'Son' class.
		gs.city();          // method contained in the 'Grandfather' class. Only possible because 'son' extends/inherits from it ('Grandfather' class)
		gs.country();      //  method contained in the 'Grandfather' class. Only possible because 'son' extends/inherits from it ('Grandfather' class)
		System.out.println(gs.z); // variable contained in the 'Grandfather' class. Only possible because 'son' extends/inherits from it ('Grandfather' class
		
		System.out.println(gs.add(99, 1));
		/* or (same thing)
		int result= gs.add(-1, -99);
		System.out.println(result);
		*/	
		

		//seperate:
		/*
		 
		B_son s= new B_son();   // this ignores the inheritance aspect.
		
		
		// Hence  "ob" will only access the methods and the variable available ONLY in B_son, 
		s.activities();   
		
		*/
		
		//C_grandSon gs= new B_son(); // non-valid line of code.
	}
	
	public int add (int a, int b)
	{
		return a+b;
		// System.out.println   try this statement and observe 
	}

}
