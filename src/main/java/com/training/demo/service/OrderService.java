package com.training.demo.service;

import com.training.demo.dto.OrderDto;
import com.training.demo.model.Order;
import com.training.demo.model.OrderDetails;
import com.training.demo.repo.OrderRepo;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    public Optional<Order> findById(Integer id) {
        return Optional.of(orderRepo.findById(id).orElse(null));
    }

    public Order save(Order order) {
        return orderRepo.save(order);
    }

    public void deleteById(Integer id) {
        orderRepo.deleteById(id);
    }
}
