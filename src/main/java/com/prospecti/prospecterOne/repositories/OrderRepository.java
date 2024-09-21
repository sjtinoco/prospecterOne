package com.prospecti.prospecterOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospecti.prospecterOne.entities.Order;


// não precisa colocar @Rpository pois herda de JpaRepository que já é um componente spring
public interface OrderRepository extends JpaRepository<Order, Long>  {
}
