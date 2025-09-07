package overriding;

// and also...observe this class as well !
public class FInal_D_Dog extends Final_C_Animal { // meaning THIS IS where the method previously defined in "Final_C_Animal" will be overridden.

	    // Overriding the sound method
	    @Override
	    public void sound() {
	        System.out.println("overridden method message. Dog barks");
	    }
	}

