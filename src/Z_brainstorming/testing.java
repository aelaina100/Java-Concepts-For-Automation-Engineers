package Z_brainstorming;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testing {

	@Test
	public void program()
	{
		String phrase= "eve";   //"One Two Three"
		//Now reverse this string.
		String reverse= "";
		for(int i=phrase.length()-1;  i>=0 ;i--)
		{
			reverse= reverse +phrase.charAt(i);
			
		}
		System.out.println(reverse);
		if(! phrase.equalsIgnoreCase(reverse))
				{
			       Assert.assertTrue(false, "The phrase is NOT a palindome as: "+ phrase + " is NOT: "+ reverse);
				}
		else
		{
			System.out.println("Success: It is a palindrome as: " +phrase+ " is: "+ reverse);
			
		}
			
	}

	}


