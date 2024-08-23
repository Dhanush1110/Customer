package com.project.lodge.repository;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.project.lodge.entity.Customer;

	public interface CustomerRepository extends JpaRepository<Customer, Long> {
	}



