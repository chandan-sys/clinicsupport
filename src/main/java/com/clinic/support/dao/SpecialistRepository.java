package com.clinic.support.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.support.entity.Specialist;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist,Integer>{

}
