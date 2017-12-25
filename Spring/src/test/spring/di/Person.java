package test.spring.di;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	private String beanName;
	private String name;
	private int age;
	private Address address;
	private Phone phoneObj;
	private List<Device> deviceList;
	private Set<Device> deviceSet;
	private Map<String, Device> deviceMap;
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Person(){
		
	}
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age, Address address, Phone phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneObj = phone;
	}

	public Person(int age) {
		this.age = age;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public Address getAddress() {
		return address;
	}

	public Phone getPhoneObj() {
		return phoneObj;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPhoneObj(Phone phone) {
		this.phoneObj = phone;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	void printDetails() {
		System.out.println("Hey, My name " 
								+ getName() + 
								" I am  "+getAge()+" Years Old. I live @"+
								getAddress().getHouse_no()+" "+getAddress().getStreet()+", "+getAddress().getCity()+", "+
								getAddress().getState()+", "+getAddress().getCountry()+", "+getAddress().getZipcode()+".\n"+
								"Please reach me at my work number @"+getPhoneObj().getWork());
		System.out.println("Bean Name is ::"+getBeanName()+", I have the following device List \n");
		for(Device device:  deviceList){
			System.out.println("device name "+device.getName());
		}
		System.out.println(" I have the following device Set \n");
		for(Device device:  deviceSet){
			System.out.println("device name "+device.getName());
		}
		
		System.out.println(" I have the following device Map \n");
		Iterator<Map.Entry<String,Device>> it = deviceMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,Device> entry = it.next();
			System.out.println(entry.getKey()+"::"+((Device)entry.getValue()).getName());
		}
	}

	public List<Device> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<Device> deviceList) {
		this.deviceList = deviceList;
	}

	public Set<Device> getDeviceSet() {
		return deviceSet;
	}

	public void setDeviceSet(Set<Device> deviceSet) {
		this.deviceSet = deviceSet;
	}

	public Map<String, Device> getDeviceMap() {
		return deviceMap;
	}

	public void setDeviceMap(Map<String, Device> deviceMap) {
		this.deviceMap = deviceMap;
	}

}
