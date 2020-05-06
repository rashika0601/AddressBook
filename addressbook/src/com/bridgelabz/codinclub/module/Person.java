package com.bridgelabz.codinclub.module;
import java.util.*;
import java.io.*;
public class Person {
		private String id="";
	 	private String firstName;
	    private String lastName;
	    private String address;
	    private String city;
	    private String state;
	    private String phone;
	    private String zip;
	   
	

	public Person(String id, String firstName, String lastName, String add, String city, String state,
			String phone, String zip) {
		
		this.id = id;
		this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.zip = zip;
        
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastname) {
		this.lastName = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	 public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

		public String getPhone() {
		        return phone;
		    }

		public void setPhone(String phone) {
		        this.phone = phone;
		    }
		    
	public String getZip() {
		return zip;
	}

	public void setzip(String zip) {
		this.zip = zip;
	}
	

	//@Override
	public static Comparator<Person> firstNameComp = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
		   String firstName1 = p1.getfirstName().toUpperCase();
		   String firstName2 = p2.getfirstName().toUpperCase();
		   return firstName1.compareTo(firstName2);
  }};
  public static Comparator<Person> ZipComp= new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
		   String zip1 = p1.getZip();
		   String  zip2 = p2.getZip();
		   return zip1.compareTo(zip2);
	}};
	public static Comparator<Person> lastNameComp = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
		   String lastName1 = p1.getlastName().toUpperCase();
		   String lastName2 = p2.getlastName().toUpperCase();
		   return lastName1.compareTo(lastName2);
  }};
	//@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName +", lastName=" + lastName+ ", address=" + address + ", city=" + city 
				+ ", state=" +state + ",  phone=" + phone + " , zip=" + zip + " ]";
	}
}