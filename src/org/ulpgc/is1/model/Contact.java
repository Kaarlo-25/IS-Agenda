package org.ulpgc.is1.model;

public abstract class Contact {
	//Constructor
	private String telephone;
	private String email;

	public Contact(String telephone, String email) {
		this.telephone = telephone;
		this.email = email;
	}

	//Getters and setters
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//Methods
	public abstract void abstractMethod();
}
