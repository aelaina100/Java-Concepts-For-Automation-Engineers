package A_Java_Programs_Basics;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

public class D_4_Looping {
	/* Two important iteration techniques:-
	 * 
	 * A- Iterating from index 0
	 * B- Iterating from the last index.
	 *  
	 * To begin explaining them, below, I am first going to define:
	 * An array or a string AND a collection class.
	 * 
	 * 		Note:  .length() is a method that applies to both Strings & arrays (Fixed-length data structure).
	 *              Whereas .size() applies to a variable-length collection class.
			        .Both start from 1 (Common sense).
	 * 	 
	 *
	 *
	 * Examine, given===>  Elements     : A B C D
	 *                             index: 0 1 2 3 
	 *                                            where length is 4
	 *   Keep in mind, the discrepancy as length starts from 1 whereas index ALWAYS from 0.
	 *   [If you're going to use the .length() method... For example: when needing to iterate from the last element].
	 *                 
	 *                 Otherwise, you get: Out-Of-Bound-Index error
	 *   Note: The above note also works for .size() method.
	 *                         
	 */
	          
	@Test
	public void loopingFrom_firstItem()
	{
		String phrase= "Some";
		for(int i=0; i< phrase.length();i++) // i=0, i=1, i=2, i=3 (code between {} will execute 4 times).
		{
		 // the variable 'i' has to be deployed in this code to indeed achieve iteration. For example:
			
			char character= phrase.charAt(i); // as soon as .charAt(i) is used, compiler will immediately assign indexes to:
		
			                  /*      S o m e
			                   *      - - - -
			                   *      0 1 2 3
			                   */            // Same thing could be said to .indexOf(); method.
			
			   
		}
		
		String names[]= {"Kaku", "Ryu", "Oshinko"};  
		for(int j=0; j<names.length; j++)      //  j=0, j=1, j=3 (code between {} will execute 3 times).
		{
        // the variable 'j' has to be deployed in this code to indeed achieve iteration. For example:
			
			String name= names[j];
			                   
		}
		
	
		List<String> jobs_arrylist =Arrays.asList("QA", "Developer");  // 
		for(int z=0; z<jobs_arrylist.size(); z++)     // z=0, z=1
		{
			//   // the variable 'z' has to be deployed in this code to indeed achieve iteration. For example:
			    String job= jobs_arrylist.get(z);
		}
	}
	
	@Test
	public void loopingFrom_lastItem()
	{
		String phrase= "Some";
		for(int i=phrase.length()-1; i>=0 ; i--)  // i=3, i=2, i=1, i=0 (code between {} will execute 4 times).
			                                     // the middle condition lets you to iterate all the way back to index 0. Where
			                                     // if you make it i>0, then it will skip iterating at the 0 index.
			                                     
		{
			char character= phrase.charAt(i);  // If you do NOT include -1 in the 'for' line, then you'd have to do it here .charAt(i-1);
			// PLUS all the notes in the respective class above.
		}
		
		String names[]= {"Kaku", "Ryu", "Oshinko"};  
		for(int j=names.length-1; j>=0    ;j--)  //j=2, j=1, j=0 (code between {} will execute 3 times).
		{                                // the middle condition lets you to iterate all the way back to index 0.
			
			String name= names[j];             // If you do NOT include -1 in the 'for' line, then you'd have to do it here .names[j-1];
			// PLUS all the notes in the respective class above.
		}
		
		List<String> jobs_arrylist =Arrays.asList("QA", "Developer");  
		for(int z=jobs_arrylist.size()-1; z>=0;  z--)     // z=1, z=0 (code between {} will execute 2 times).
		{                                                 
			  // the variable 'z' has to be deployed in this code to indeed achieve iteration. For example:
			    String job=jobs_arrylist.get(z); // If you do NOT include -1 in the 'for' line, then you'd have to do it here .get(z-1);
				// PLUS all the notes in the respective class above.
		}
	
	} 
	

}
