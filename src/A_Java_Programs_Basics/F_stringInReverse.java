package A_Java_Programs_Basics;
import org.testng.annotations.Test;


public class F_stringInReverse {
	
       //first: print out, in order, the elements present in the below array (fixed-length data structure)
	   @Test(enabled= false)
	   public void explain()
	   {
		   String names[]= {"First", "Second", "Third"};
		   for(int i=0; i<names.length ; i++)
		   {
		    System.out.println(names[i]);
	       }
	   }
	   
	   
	   
	// print out 'Print me in reverse' in reverse
	@Test(enabled= false)
	public void reveseA() {
		
		String phrase= "Print me in reverse";
		String reversed= "";
		
		for(int i= phrase.length()-1; i>=0 ;i--) //Prefer.: first i value (with .length) SHOULD REPRESENT the actual index of the last element (without -1 it represents an out of bound index)
		{                                       //Just how when, instead, for(i=0;  ; ) i=0 reflects the actual index of the 1st element.
		 /* Below works too.
		  * char letter= phrase.charAt(i);                                   
		 reversed= reversed+ letter;  	     */
			reversed= reversed + phrase.charAt(i);
			// System.out.println(reversed);   //predict the outcome
		}
		System.out.println(reversed);
	}
	//(As soon as complier reads: "phrase.charAt(",It automatically assigns index values to each character making up the 
	// value of 'phrase', from 0 to max. Now you're asking for CharAt(max plus 1) which can not be found/ out of bound by a notch
	//since argument comes from i=phrase.length()
	
	
	
	// Another way of printing in reverse (Not preferred).
	@Test(enabled= false)
	public void reveseB() {
		
		String phrase= "Print me in reverse";
		String reversed= "";
		// below, the unpreferred way of doing it, since in the for brackets one has to included i=i-1
		for(int i= phrase.length(); i>0 ;i--)  // assume the leNgth here is 5 so:   i=5  i=4....i=1
		{
		 /* Below works too.
		  * char letter= phrase.charAt(i-1);                                   
		 reversed= reversed+ letter;  	     */
			reversed= reversed + phrase.charAt(i-1);
		}
		System.out.println(reversed);
	}
	
	 //first: print out, in verse, the elements present in the below array (fixed-length data structure)
	   @Test(enabled= true)
	   public void explainB()
	   {
		   String namess[]= {"First", "Second", "Third"};
		   for(int i= namess.length-1; i>=0   ; i--)  //i=2, i=1, i=0
		   {
		    System.out.println(namess[i]);
		    //System.out.println("oo");
	       }
	   }

}
