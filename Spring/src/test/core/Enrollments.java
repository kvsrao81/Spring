package test.core;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Enrollments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Enrollments enrol = new Enrollments();
		ArrayList<Person> pList = enrol.getPersons();
		if(pList.size() > 0){
			for(int i=0; i<pList.size(); i++){
				System.out.println("Since you are a "+pList.get(i).getAddress().getState()+" customer");
				if("TX".equalsIgnoreCase(pList.get(i).getAddress().getState())){
					System.out.println(enrol.enrollInTrading(new Options(pList.get(i)))+"\n");
					System.out.println(enrol.enrollInTrading(new Stocks(pList.get(i)))+"\n");
					System.out.println(enrol.enrollInTrading(new Futures(pList.get(i)))+"\n");
				}else{
					System.out.println(enrol.enrollInTrading(new Stocks(pList.get(i)))+"\n");
					System.out.println(enrol.enrollInTrading(new Futures(pList.get(i)))+"\n");
				}
			}
		}
		
		//Person p = new Person();
		//p.setName("Venkat");
		//Trading option = new Options(p);
		//Trading stock = new Stocks();
		//Trading future = new Futures();
		//System.out.println(enrol.enrollInTrading(option)+"\n");
		//System.out.println(enrol.enrollInTrading(stock)+"\n");
		//System.out.println(enrol.enrollInTrading(future)+"\n");
		
	}
	String enrollInTrading(Trading trade){
		String msg=null;
			trade.signUpTrading();
			if(trade instanceof Options){
				//System.out.println("You earned 5 Free Option Trades");
				msg = "Hi "+((Options) trade).person.getName()+", You earned 5 Free Option Trades";
		}else if(trade instanceof Stocks){
			//System.out.println("You earn 10 Free Stock Trades");
			msg = "Hi "+((Stocks) trade).person.getName()+", You earn 10 Free Stock Trades";
		}else if(trade instanceof Futures){
			//System.out.println("You earn 15 Free Futures Trades");
			msg = "Hi "+((Futures) trade).person.getName()+", You earn 15 Free Future Trades";
			
		}else{
			//System.out.println("Welcome to Trading.. You have a choice to enroll in options, stocks and futures.");
			msg = "Welcome to Trading. You have a choice to enroll in options, stocks and futures.";
		}
		return msg;
		
	}
	
	public ArrayList<Person> getPersons(){
		
		ArrayList<Person> personList = new ArrayList<Person>();
		Person person;
		Address address;
		
		if(personList.size() == 0){
			for(int i=0;i<10;i++){
				if(i < 5){
					 address = new Address("TX");
				}else{
					 address = new Address("MA");
				}

				person = new Person("venkat"+i, address, null);
				personList.add(person);
			}
		}
		return personList;
	}
}
