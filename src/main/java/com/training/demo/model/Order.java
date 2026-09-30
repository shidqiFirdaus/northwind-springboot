package com.training.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    public Integer order_id;
    
    public String customer_id;
    
    @ManyToOne
    @JoinColumn(name = "employee_id")
    public Employee employee;
    
    public LocalDate order_date;
    public LocalDate required_date;
    public LocalDate shipped_date;
    
    public Integer ship_via;
    public Float freight;
    public String ship_name;
    public String ship_address;
    public String ship_city;
    public String ship_region;
    public String ship_postal_code;
    public String ship_country;
}
