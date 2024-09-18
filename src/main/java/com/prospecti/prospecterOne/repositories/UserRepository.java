package com.prospecti.prospecterOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospecti.prospecterOne.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
	
}
