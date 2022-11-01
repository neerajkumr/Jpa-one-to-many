package com.spring.dto;

public class JoinInfoResponce {

	private String email;
	private String coruseName;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCoruseName() {
		return coruseName;
	}

	public void setCoruseName(String coruseName) {
		this.coruseName = coruseName;
	}

	public JoinInfoResponce() {
	}

	public JoinInfoResponce(String email, String coruseName) {
		super();
		this.email = email;
		this.coruseName = coruseName;
	}

	@Override
	public String toString() {
		return "JoinInfoResponce [email=" + email + ", coruseName=" + coruseName + "]";
	}

}
