package com.reis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reis.course.entity.OrderItem;
import com.reis.course.entity.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
