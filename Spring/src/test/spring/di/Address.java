package test.spring.di;

public class Address {
	private String house_no;
	private String street;
	private String city;
	private String state;
	private String country;
	private int zipcode;

	Address(String house_no, String street, String city, String state,
			String country, int zipcode) {
		this.house_no = house_no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String getHouse_no() {
		return house_no;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
