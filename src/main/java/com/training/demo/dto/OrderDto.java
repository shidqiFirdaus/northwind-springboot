package com.training.demo.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderDto {
    public EmployeeDto employee;
    public String customer_id;
    public String ship_name;
    public LocalDate order_date;
}
