package com.etiya.springboot.business.abstracts;

import java.util.List;

import com.etiya.springboot.core.utilities.results.DataResult;
import com.etiya.springboot.entities.concretes.Order;

public interface OrderService {
	
	DataResult<List<Order>> getAll();
}
