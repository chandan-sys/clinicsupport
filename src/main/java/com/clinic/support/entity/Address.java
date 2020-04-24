package com.clinic.support.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String street;
	
	private String landmark;
	
	private String pin;
	
	private String city;
	
	private String district;
	
	private String state;
	
}
