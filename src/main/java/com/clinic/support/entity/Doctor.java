package com.clinic.support.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
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
public class Doctor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String speciality;
	
	private String contactNumber;
	
	@ManyToMany(mappedBy="doctors")
	private Set<Clinic> clinics;
	
	private String photo;
	
	

}
