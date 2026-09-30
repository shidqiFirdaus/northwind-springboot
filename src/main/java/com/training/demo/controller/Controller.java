package com.training.demo.controller;

import com.training.demo.dto.OrderDto;
import com.training.demo.repo.OrderRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "")
class Controller {

    @Autowired
    OrderRepo order;
    @Autowired
    ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<?> hello(){
        List<OrderDto> orderDtoList = order.findAll().stream().map(order -> modelMapper.map(order,OrderDto.class)).toList();
        ResponseEntity res = ResponseEntity.ok(orderDtoList);
        return res;
    }

}
