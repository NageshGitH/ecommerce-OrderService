package com.orderservice.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderservice.application.model.CartDetails;

public interface CartDetailsRepository extends JpaRepository<CartDetails, Long>
{
	Optional<CartDetails> findByProductId(String productId);
}
