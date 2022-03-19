package com.etiya.springboot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.springboot.entities.concretes.Order;

public interface OrderDao extends JpaRepository<Order, Integer>{

}
