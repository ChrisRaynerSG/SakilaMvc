package com.sparta.cr.sakilamvcproject.repositories;

import com.sparta.cr.sakilamvcproject.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}