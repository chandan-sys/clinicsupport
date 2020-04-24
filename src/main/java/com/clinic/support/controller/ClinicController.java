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

import com.clinic.support.entity.Clinic;
import com.clinic.support.service.ClinicService;

@RestController
@RequestMapping("clinic")
public class ClinicController {

	@Autowired
	private ClinicService clinicService;
	
	@PostMapping("/insert")
	public void addClinic(@RequestBody Clinic clinic) {
		clinicService.addClinic(clinic);
	}
	
	@GetMapping("/get")
	public List<Clinic> getClinic() {
		return clinicService.getClinic();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteClinic(@PathVariable("id") Integer id) {
		clinicService.deleteClinic(id);
	}
	
	
}
