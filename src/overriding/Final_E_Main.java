package overriding;

// Now, without examining the code- Answer questions 1,2, & 3.
public class Final_E_Main {

	public static void main(String[] args) {
		
		//1-  Now, execute the overridden method !
		
		FInal_D_Dog ob= new FInal_D_Dog();  // object accesses the overriden method.
		ob.sound();
		
		//2-  Now, execute the original method before it was overridden !
		
		Final_C_Animal  object= new Final_C_Animal(); 
	    object.sound();
	    
	    //3-  Interview question: Can you guess the output of the below line:
	    Final_C_Animal  obj= new FInal_D_Dog();
	    obj.sound();
	
	}   

}
