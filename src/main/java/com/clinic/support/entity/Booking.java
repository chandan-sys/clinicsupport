package com.clinic.support.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private LocalDateTime bookingDateTime;
	
	@JoinColumn(name="clinicId")
	private Clinic clinic;
	
	@JoinColumn(name="doctorId")
	private Doctor doctor;
	
	@JoinColumn(name="userId")
	private User user;
	
	private LocalDateTime appointmentDateTime;
	
	private String disease;
	
	private BigDecimal payment;
	
	private String status;

}
