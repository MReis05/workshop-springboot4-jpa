package com.reis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reis.course.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
