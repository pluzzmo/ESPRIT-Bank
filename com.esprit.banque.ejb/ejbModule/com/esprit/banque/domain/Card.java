package com.esprit.banque.domain;

import java.io.Serializable;
import java.util.Date;

public class Card implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
    private String number;
    private Date expiryDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Card() {
		super();
	}
	public Card(String number, Date expiryDate) {
		super();
		this.number = number;
		this.expiryDate = expiryDate;
	}

}
