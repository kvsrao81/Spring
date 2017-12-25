package test.core;

public class Stocks implements Trading{

	Person person;
	
	Stocks(){
	}
	
	Stocks(Person person){
		this.person = person;
	}
	@Override
	public void signUpTrading() {
		// TODO Auto-generated method stub
		System.out.println("Signed up for Stocks Trading");
	}

}
