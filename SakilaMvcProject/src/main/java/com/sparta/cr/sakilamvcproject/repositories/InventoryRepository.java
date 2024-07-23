package com.sparta.cr.sakilamvcproject.repositories;

import com.sparta.cr.sakilamvcproject.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}