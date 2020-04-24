package com.clinic.support.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.support.entity.Specialist;
import com.clinic.support.service.SpecialistService;

@RestController
@RequestMapping("specialist")
public class SpecialistController {

	@Autowired
	private SpecialistService specialistService;

	@PostMapping("/insert")
	public void addSpecialist(@RequestBody Specialist specialist) {
		specialistService.addSpecialist(specialist);
	}

	@GetMapping("/get")
	public List<Specialist> getSpecialists() {
		return specialistService.getSpecialists();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteSpecialists(@PathVariable("id") Integer id) {
		specialistService.deleteSpecialists(id);
	}
	
}
