package InterfaceConcept;

public class Developing implements BankingClient, DomainClient{ // could've as many interfaces as wished. 
	
	//A class either does the extending or the implementing
	 // A class extends another class ONLY.
	 // A class implements another interface ONLY.

	public static void main(String[] args) {
		
		Developing d= new Developing(); 
		// Accessing all undeveloped methods in BankingClient & DomainClient INTERFACES, & this 'Developing' class.
		
		d.checkingBalance();
		d.payCreditCard();
		d.transferBalance();
		d.login();
		d.investment();
		
		// Below: Once you see different syntaxes in object creation, then===> it is a class (After 'new') that implements the interface.
		BankingClient bc= new Developing(); // Accesses all method(s) & variable(s) in BankingClient interface ONLY
		bc.checkingBalance();
		bc.payCreditCard();
		bc.transferBalance();
		
		
		DomainClient dc= new Developing();  // Accesses all method(s) & variable(s) in DomainClient interface  ONLY
		dc.investment();	
		
	}

	@Override
	public void payCreditCard() {
		
		
	}

	@Override
	public void transferBalance() {
		
		
	}

	@Override
	public void checkingBalance() {
		
		
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		
	}
	
	public void login()  // typed/added 
	{
		
	}


	}


