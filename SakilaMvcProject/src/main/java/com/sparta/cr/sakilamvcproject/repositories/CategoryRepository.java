package com.sparta.cr.sakilamvcproject.repositories;

import com.sparta.cr.sakilamvcproject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Short> {
}