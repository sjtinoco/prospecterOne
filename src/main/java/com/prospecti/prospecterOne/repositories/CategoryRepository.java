package com.prospecti.prospecterOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospecti.prospecterOne.entities.Category;


// não precisa colocar @Repository pois herda de JpaRepository que já é um componente spring
public interface CategoryRepository extends JpaRepository<Category, Long>  {
}
