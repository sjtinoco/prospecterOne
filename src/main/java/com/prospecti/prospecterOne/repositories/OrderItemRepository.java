package com.prospecti.prospecterOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospecti.prospecterOne.entities.OrderItem;
import com.prospecti.prospecterOne.entities.pk.OrderItemPK;


// não precisa colocar @Rpository pois herda de JpaRepository que já é um componente spring
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {
}
