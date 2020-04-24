package com.clinic.support.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.support.dao.ClinicRepository;
import com.clinic.support.entity.Clinic;

@Service
public class ClinicService {

	
	@Autowired
	private ClinicRepository clinicRepository;
	
	public void addClinic(Clinic clinic) {
		
		clinicRepository.save(clinic);
	}
	
	public List<Clinic> getClinic(){
		
		return clinicRepository.findAll();
	}
	
	public void deleteClinic(Integer id) {
		
		clinicRepository.deleteById(id);
	}
	
}
