package com.paulosergio.cursojava.repositories;

import com.paulosergio.cursojava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
