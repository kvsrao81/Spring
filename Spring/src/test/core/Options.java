package test.core;

public class Options implements Trading{
	Person person;
	
	Options(){
	}
	
	Options(Person person){
		this.person = person;
	}
	@Override
	public void signUpTrading() {
		// TODO Auto-generated method stub
		System.out.println("Signed up for Options Trading");
	}

}
