package com.reis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reis.course.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
