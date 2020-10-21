package com.mdfshopping.core.repository;

import com.mdfshopping.core.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {}
