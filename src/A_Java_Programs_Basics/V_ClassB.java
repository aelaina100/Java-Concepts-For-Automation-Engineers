package A_Java_Programs_Basics;

//Instructions: Ignore all the compiler errors/warnings (Don't read them).
// In here it is obvious that my intention is to add the value of 'number' declared in the other class to 6 
//and then print out the result.
// so without running the program, predict the outcome:
   // the outcome is either the result of the addition OR this is not possible ?
   // If it is not possible, then 1- Why ?  2- How could it be fixed ?
public class V_ClassB {
	
	public static void main(String[] args) {
	
		V_ClassA object= new V_ClassA();
		int result= object.random()+6;
		System.out.println(result);	
	}
}





/*Answer: 
 One would get a compiler error. The method object.random() is declared with a return type of void, 
 which means it does not return any value. Since the program attempts to use object.random() 
 in an arithmetic expression (object.random() + 6), the compiler will reject this because you 
 cannot add a value to void.
 * 
 * How to fix this issue?
 * The solution is to change the return type of the random() method from void to int,
 * and include a return statement inside the method.
 * 
 * so the other class should be:
 * 
 * public class V_ClassA {
	
   
        int value = 500;
        
		public int random() 
		{
			int number = 3;  // this line could be declared globally (Above and outside this method)   100!
			return number;   // another option is:   return value;
			
		}
		
		
	}
 */


