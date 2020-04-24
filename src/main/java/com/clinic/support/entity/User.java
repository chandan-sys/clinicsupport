package com.clinic.support.entity;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String photo;
	
	private String contactNumber;
	
	@Embedded
	private Address address;
	
	private String email;

}
