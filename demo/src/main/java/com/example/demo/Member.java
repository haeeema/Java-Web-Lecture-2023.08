package com.example.demo;

public class Member {
	private int id;
	private String name;
	private String email;
	private Address addr;
	private String Nationality;
	private String Gender;

	// Constructor
	public Member(int id, String name, String email, Address addr, String nationality, String gender) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.Nationality = nationality;
		this.Gender = gender;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + ", addr=" + addr + ", Nationality=" + Nationality
				+ ", Gender=" + Gender + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
}	
