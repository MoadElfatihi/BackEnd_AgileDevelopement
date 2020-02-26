package com.user.bo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class UserBO implements IUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="pk_seq")
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;

	@Column(name="age")
	private Long age;

	public UserBO() {
		super();
	}

	public UserBO(String firstName, String lastName, String email, Long age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "UserBO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + "]";
	}	
}
