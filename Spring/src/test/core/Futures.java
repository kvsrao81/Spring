package test.core;

public class Futures implements Trading{

	Person person;
	
	Futures(){
	}
	
	Futures(Person person){
		this.person = person;
	}
	
	@Override
	public void signUpTrading() {
		// TODO Auto-generated method stub
		System.out.println("Signed up for Futures Trading");
	}

}
