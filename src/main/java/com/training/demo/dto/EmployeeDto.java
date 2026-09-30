package com.training.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDto {
    public String last_name;
    public String first_name;
    public String title;
    public String title_of_courtesy;
    public LocalDate birth_date;
    public LocalDate hire_date;
    public String address;
}
