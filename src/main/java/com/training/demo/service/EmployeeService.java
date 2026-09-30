package com.training.demo.service;

import com.training.demo.model.Employee;
import com.training.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@jakarta.transaction.Transactional
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> findById(Integer id) {
        return Optional.ofNullable(employeeRepo.findById(id).orElse(null));
    }

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteById(Integer id) {
        employeeRepo.deleteById(id);
    }
}
