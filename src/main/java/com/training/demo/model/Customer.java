package com.training.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "customers")
public class Customer {
    @Id
    @Column(name = "customer_id")
    public String customer_id;
    
    @Column(name = "company_name", length = 40)
    public String company_name;
    
    public String contact_name;
    public String contact_title;
    public String address;
    public String city;
    public String region;
    public String postal_code;
    public String country;
    public String phone;
    public String fax;
}
