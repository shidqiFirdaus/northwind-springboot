package com.training.demo.repo;

import com.training.demo.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails,Integer> {
}
