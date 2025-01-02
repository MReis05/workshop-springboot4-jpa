package com.reis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reis.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
