package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbprofile")
public class ProfileMode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="id" )	
	long id;
	
	
	@Column(name="name"  )
	String name;
	 
	@Column(name="email"  )
	String email;
	
	
	@Column(name="color"  )
	long color;


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public long getColor() {
		return color;
	}


	public void setColor(long color) {
		this.color = color;
	}


	public ProfileMode(long id, String name, String email, long color) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.color = color;
	}


	public ProfileMode() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

	 
	
 
	
	

}
