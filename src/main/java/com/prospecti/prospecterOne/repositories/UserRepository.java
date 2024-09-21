package com.prospecti.prospecterOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospecti.prospecterOne.entities.User;


// não precisa colocar @Rpository pois herda de JpaRepository que já é um componente spring
public interface UserRepository extends JpaRepository<User, Long>  {
}
