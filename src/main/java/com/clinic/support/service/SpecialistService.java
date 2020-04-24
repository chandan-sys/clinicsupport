package com.clinic.support.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.support.dao.SpecialistRepository;
import com.clinic.support.entity.Specialist;

@Service
public class SpecialistService {

	@Autowired
	private SpecialistRepository specialistRepository;

	public void addSpecialist(Specialist secialist) {
		specialistRepository.save(secialist);
	}

	public List<Specialist> getSpecialists(){
		return specialistRepository.findAll();
	}

	public void deleteSpecialists(Integer id) {
		specialistRepository.deleteById(id);
	}

}
