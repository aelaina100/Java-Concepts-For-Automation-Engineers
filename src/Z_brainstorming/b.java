package Z_brainstorming;

import org.testng.annotations.Test;

public class b {


		
		 //first: print out, in verse, the elements present in the below array (fixed-length data structure)
		   @Test(enabled= true)
		   public void explainB()
		   {
			   String reversed= "";
			   String phrase= "Print me in reverse";
			   for(int i= phrase.length()-1; i >=0    ;i--)
			   {
				  reversed= reversed + phrase.charAt(i);
			   }
		       
			   System.out.println(reversed);
		   }
		
		   
		   

	}


