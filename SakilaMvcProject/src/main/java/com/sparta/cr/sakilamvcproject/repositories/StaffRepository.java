package com.sparta.cr.sakilamvcproject.repositories;

import com.sparta.cr.sakilamvcproject.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Short> {
}