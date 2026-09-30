package com.training.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "order_details")
public class OrderDetails {
    @Id
    @Column(name = "order_id")
    public Integer order_id;
    
    public Integer product_id;
    public Float unit_price;
    public Integer quantity;
    public Float discount;
}
