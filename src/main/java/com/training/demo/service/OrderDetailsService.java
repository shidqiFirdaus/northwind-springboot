package com.training.demo.service;

import com.training.demo.model.OrderDetails;
import com.training.demo.repo.OrderDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class OrderDetailsService {

    @Autowired
    private OrderDetailsRepo orderDetailsRepo;

    public List<OrderDetails> findAll() {
        return orderDetailsRepo.findAll();
    }

    public Optional<OrderDetails> findById(Integer id) {
        return Optional.ofNullable(orderDetailsRepo.findById(id).orElse(null));
    }

    public OrderDetails save(OrderDetails details) {
        return orderDetailsRepo.save(details);
    }

    public void deleteById(Integer id) {
        orderDetailsRepo.deleteById(id);
    }
}
