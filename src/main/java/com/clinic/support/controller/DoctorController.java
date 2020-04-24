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

import com.clinic.support.entity.Doctor;
import com.clinic.support.service.DoctorService;

@RestController
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/insert")
	public void addDoctor(@RequestBody Doctor doctor) {
		doctorService.addDoctor(doctor);
	}
	
	@GetMapping("/get")
	public List<Doctor> getDoctor() {
		return doctorService.getDoctor();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteDoctor(@PathVariable("id") Integer id) {
		doctorService.deleteDoctor(id);
	}
}
