package edu.ubbcluj.doghome.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity 
@Table(name = "doghome_users")
public class DogHomeUser extends BaseEntity {

	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String telephone;
	
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
	public DogHomeUser(String username, String password, String firstname, String lastname, String email,
			String telephone) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.telephone = telephone;
	}

	// For JPA
	public DogHomeUser() {
		super();
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "DogHomeUser [username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", telephone=" + telephone + ", role=" + role
				+ ", uuid=" + uuid + "]";
	}


	
	

}
