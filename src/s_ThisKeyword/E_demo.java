package s_ThisKeyword;
// the solution is provided here as a separate class instead of modifying D_demo (D_demo is a part of the Question)
public class E_demo {
	
	int a; 
	
	public E_demo(int a) // executed as soon as "E_demo object= new E_demo(a);" is executed in the other class
	{                    
		this.a = a; // This global variable 'a' in this class equals the carried over 'a' from the other class.
	}
	
	
	
	public int increment() // Condition: do not parameterize this method.
	{
		a=a+1; 
		return a;
	}
	
	// Now, try to solve this problem by parameterizing the increment() method in D_demo (Document it).

}
/* Note: As you can see - This utility class focusses on doing one thing and
 *       that is incrementing by including a re-usable incrementing method. (or decrementing if you would like 
 *       to add a re-usable decrement() method).
 *       If one would like to include additional method(s) for multiplication such as mutliply by 1/2 
 *       and/or 2 and/or 3 etc. then it is advised to not include it here in this utility class as it is
 *       only designated for incrementing/decremeting.
 *       
 *       Instead, create a separate utility class that focusses one doing one thing and that is multiplication.
 *       
 *        Now, this is where the Signle Responisiblity Principe come into play:--->
 *        
 *        The Single Responsibility Principle (SRP) is one of the five SOLID principles of object-oriented 
 *        design. It states that:

          A class (or module) should have only one reason to change.Meaning:
            
A class should focus on doing one thing well. That "one thing" is called its responsibility.
If a class has more than one responsibility, changes in one area could unintentionally affect the other — 
increasing the risk of bugs.

Why SRP Matters
1- Easier Maintenance → You can change one responsibility without affecting others.

2- Better Readability → The class is easier to understand.

3- Improved Testability → Each responsibility can be tested in isolation.

4- Reusability → Smaller, focused classes can be reused in different contexts.
 *       
 * 
 *
 */
         