package A_Java_Programs_Basics;

public class C_1basics2 {

	public static void main(String[] args) {
		
		D_1methods2 m2= new D_1methods2();
		m2.validateResults(); // Going to execute what's between the brackets of the validateResults() method.
		                     // also, this line will be equal to 10 (but it's not caught = value of 10 is not stored into a variable
		                     // for subsequent use).
		System.out.println("################################################");
		
		System.out.println(	m2.validateResults());  // does 2 things in order: 1- executes lines of code of validateResults() method.
		                                           //                          2- prints out value that validateResults returns (if any)
		System.out.println("************************************************");
		
		int value= m2.validateResults(); // value stores "10"  // this line also prints out "Programming fundementals"
		// does 2 things in order: 1- executes lines of code of validateResults() method.
		//                         2- The value the method returns is caught (stored in the variable named 'value').
		System.out.println("=======================================================");
		System.out.println("returned value is " + value);

	}

}
