package entity;

import java.util.Date;

public class user {
	private String firstName;
	private String lastName;
	private int id;
	private String password;
	private String dateOfBirth;
	private String mobileN;
	public user(String firstName, String lastName, int id, String password, String dateOfBirth, String mobileN) {
		super();
		this.firstName = firstName;
		this.id = id;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.mobileN = mobileN;
	}
	public user() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMobileN() {
		return mobileN;
	}
	public void setMobileN(String mobileN) {
		this.mobileN = mobileN;
	}
	
}
