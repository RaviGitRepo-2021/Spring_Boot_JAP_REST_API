package com.example.rest.api.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_profiles")
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="up_id")
	private long userID;
	
	@Column(name="first_name",nullable=false,length=50)
	private String firstName;
	
	@Column(name="last_name",nullable=false,length=50)
	private String lastName;
	
	@Column(nullable=false)
	private byte age;
	
	@Column(nullable = false)
	private String gender;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@MapsId
//	private UserMaster userMaster;
	/**
	 * @param userEmail
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gender
	 */
	public UserProfile(String userEmail, String firstName, String lastName, byte age, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}
	/**
	 * 
	 */
	public UserProfile() {
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
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
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "UserProfile [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender +"]";
	}
	
	
}
