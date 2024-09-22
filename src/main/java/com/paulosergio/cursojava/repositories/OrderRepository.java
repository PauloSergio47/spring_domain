package com.paulosergio.cursojava.repositories;

import com.paulosergio.cursojava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
