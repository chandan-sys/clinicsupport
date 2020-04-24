package com.clinic.support.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.support.dao.DoctorRepository;
import com.clinic.support.entity.Doctor;

@Service
public class DoctorService {

	
	@Autowired
	private DoctorRepository doctorRepository;
	
	
	public void addDoctor(Doctor doctor) {
		
		doctorRepository.save(doctor);
	}
	
	public List<Doctor> getDoctor(){
		return doctorRepository.findAll();
	}
	
	public void deleteDoctor(Integer id) {
		doctorRepository.deleteById(id);
	}
	
	
}
