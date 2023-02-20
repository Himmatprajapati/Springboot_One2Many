package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.customer;

public interface customerrepository extends JpaRepository<customer, Integer>{

}
