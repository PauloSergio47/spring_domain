package com.paulosergio.cursojava.repositories;

import com.paulosergio.cursojava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
