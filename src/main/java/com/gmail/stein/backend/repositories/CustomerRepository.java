package com.gmail.stein.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.stein.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
