package com.training.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    public Integer employee_id;
    
    @Column(name = "last_name", length = 20)
    public String last_name;
    
    @Column(name = "first_name", length = 10)
    public String first_name;
    
    public String title;
    public String title_of_courtesy;
    public LocalDate birth_date;
    public LocalDate hire_date;
    public String address;
    public String city;
    public String region;
    public String postal_code;
    public String country;
    public String home_phone;
    public String extension;
    public byte[] photo;
    public String notes;
    public Integer reports_to;
    public String photo_path;
}
