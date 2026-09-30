package com.training.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "shippers")
public class Shipper {
    @Id
    @Column(name = "shipper_id")
    public Integer id;
    
    @Column(name = "company_name", length = 40)
    public String company_name;
    
    public String phone;
}
