package com.clinic.support.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.support.entity.Clinic;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic,Integer>{

}
