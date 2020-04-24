package com.clinic.support.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.support.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
