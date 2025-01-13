package com.reis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reis.course.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
