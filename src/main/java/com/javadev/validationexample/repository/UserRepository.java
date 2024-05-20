package com.javadev.validationexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javadev.validationexample.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(Integer userId);
}
