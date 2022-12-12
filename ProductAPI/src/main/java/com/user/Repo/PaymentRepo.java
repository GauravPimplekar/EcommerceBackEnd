package com.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Model.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
