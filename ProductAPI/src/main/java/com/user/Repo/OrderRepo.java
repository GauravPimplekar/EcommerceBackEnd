package com.user.Repo;

import javax.persistence.criteria.Order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Model.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

}
