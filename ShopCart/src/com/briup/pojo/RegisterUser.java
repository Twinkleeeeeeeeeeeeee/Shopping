package com.briup.pojo;

public class RegisterUser {
	private int id ;
	private String name;
	private String password;
	private String address;
	private int zip;
	private int telephone;
	private String email;
	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RegisterUser(String name, String password, String address, int zip, int telephone, String email) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.zip = zip;
		this.telephone = telephone;
		this.email = email;
	}
	
	public RegisterUser(int id, String name, String password, String address, int zip, int telephone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.zip = zip;
		this.telephone = telephone;
		this.email = email;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "RegisterUser [name=" + name + ", password=" + password + ", address=" + address + ", zip=" + zip
				+ ", telephone=" + telephone + ", email=" + email + "]";
	}
	
	
}