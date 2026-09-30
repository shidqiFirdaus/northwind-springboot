package com.training.demo.repo;

import com.training.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    @Query("Select e from employees e where e.first_name = ?1")
    Employee findByFirstName(String first_name);
}
