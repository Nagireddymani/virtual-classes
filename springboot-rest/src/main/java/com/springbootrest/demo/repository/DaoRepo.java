package com.springbootrest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrest.demo.models.User;

public interface DaoRepo extends JpaRepository<User, Integer> {

}
