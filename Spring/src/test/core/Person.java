package test.core;

public class Person {
	
	private String name;
	private Address address;
	private Phone phone;
	
	Person(String name, Address address, Phone phone){
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
}
