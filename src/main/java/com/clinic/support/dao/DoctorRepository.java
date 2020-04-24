package com.clinic.support.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.support.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{

}
