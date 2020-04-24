package com.clinic.support.entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Clinic implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	@Embedded
	private Address address;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Doctor> doctors;
	
	private String specialities; 
	
	private LocalTime openingTime;
	
	private LocalTime closingTime;
	
	private String photo;
	
	private Integer ratings;
	
	
	
	

}
