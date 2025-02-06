package A_Java_Programs_Basics;
import org.testng.annotations.Test;

public class E_Strings {

	@Test(enabled= false)
	public void StringsBasicsOne(){
		
		String text= "WERD"; 
		text.length();   // length starts from 1
		System.out.println(text.length());
		// Indicating 'text' is also an object of the class "String", used to access its methods to manipulate/ extract info about strings.
		// It follows that:  String text= new String("werd"); is an equivalent line of code.Nevertheless, developers made it easier.
		// 'String' is a pre-defined/default class coming with the downloaded java packages
		
		String s= "Payment $100 payed"; // Display the character that's displayed in the 8th index ?
		System.out.println(s.charAt(8));
		//char f= s.charAt(8);
		
		
		//Below: Display the index that the character "t" occupies
		System.out.println(s.indexOf("t"));
		
		//Below: Display the substring that starts from the 6th index and onwards.
		System.out.println(s.substring(6));
		
		//Below: Display the substring that starts with 'm' and onwards.
		System.out.println(s.substring(3));
		// below: exercise- Explore the other 'Substring' method & the 'subSequence' one. *************************************************
		
		// Below" convert the 'text' string to small letters and display it on the screen
		System.out.println(text.toLowerCase());
		
		// Below" convert the 's' string to capital letters and display it on the screen.
		System.out.println(s.toUpperCase());
		System.out.println("***********************End of Program ***************************");
	}
	
@Test(enabled= false)
public void StringBasicsTwo()
{
	// Styles of defining strings are:
		// A- String literal: (prefered)
	          String s= "Welcome to java";
	          
	    // B- String object:
	          String t = new String("java programming");

  // Also notice:
	          String u= "Concise communication";
	    // Now, if I declare:
	          String v= "Concise communication"; 
	        //Object 'v' will NOT be created, as "Concise communication" is already assigned to the memory object named 'u'.
	
  //Also notice:
	          String w= new String("Low-tone controlled speech");
	          String x= new String("Low-tone controlled speech");
	       //Object 'x' will NOT be created as ""Low-tone controlled speech" is already assigned to the memory object named 'w'.
	          
}
	
	
@Test(enabled= true)
public void StringSplitting_A()
{
	String sent=  "One two three"; 
	// split based on 'two'
	sent.split("two");  // // returns an array {"One ", " three"}, so go ahead and capture it by declaring an array variable.
	String arr[]= sent.split("two"); // returns an array {"One ", " three"}
	String first= arr[0];  // should return "one "    Notice the space.
	String second= arr[1]; // should return " three"  notice the space.
	String secondNoSpace= arr[1].trim();  // should return " three"  with no spaces before or after 'three'.
	
	System.out.println(first);
	System.out.println(second);
	System.out.println(secondNoSpace);
	System.out.println("--------------------------------------------------------------------------------------------");
	
	System.out.println("But the optimized way of doing it, is as follows===> ");
	System.out.println(sent.split("two")[0]);
	// OR: in case you'd like to save the element in the 1st index:
	String firstElement= sent.split("two")[0];
	System.out.println(firstElement);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	
	String second_final= second.trim(); // trims all spaces so we will have "three" and do the same for "one " 
	String first_final= first.trim();
	System.out.println(second_final);
	System.out.println(first_final);
	System.out.println("But the optimized way of doing it, is as follows===> ");
	
	String trimmedSecondElement= sent.split("two")[0].trim();
	System.out.println(trimmedSecondElement);
	System.out.println("============================================================================================");
	
	// Now print out this string in reverse
	String sent_reverse= "";
	for(int i=sent.length(); i>0 ; i--)  // i>0  because: x..2,1   especially that '1' has to execute. Hence > 0
	{
		sent_reverse= sent_reverse + sent.charAt(i-1);
	}
	
	System.out.println(sent_reverse);
	System.out.println("***********************End of Program ***************************");}


@Test(enabled= false)
public void StrinsSplitting_B()
{
	
	// below are my findings for splitting based on a single space:
	String sent=  "One two three";
	String array[] = sent.split(" "); // splits based on all spaces. When a string is split, it becomes an array (common sence)
	  String firsty = array[0];    // One
      String secondy = array[1];  // "two three"
	  String thirdy = array[2];
	
	System.out.println(firsty);
	System.out.println(secondy);
	System.out.println(thirdy);    
	System.out.println("***********************End of Program ***************************");
	}
}
		
	
	/* Crucial: Get familiar with methods, that are EXCLUSIVE to the String class, such as:
	 * 
	 * 	  .indexOf()  .charAt()  .contains()  .split()  .substring()   .toLowerCase()  .toUpperCase()  
	 * 
      NOTICE that: .contains() & .indexOf() methods are for strings & arrayList. For arrays (Fixed-length) data structure, 
                 // iterating through each element is instead required.
		 
           
      */


