package com.training.demo;

import com.training.demo.model.Employee;
import com.training.demo.repo.EmployeeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.AutoConfigureDataJpa;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RepoTest {

    @Autowired
    private EmployeeRepo employeeRepo;

//    private Employee testEmployee;
//    @BeforeEach
//    void insertEmployee(){
//        testEmployee = new Employee();
//        testEmployee.address = "test";
//        testEmployee.employee_id = 99;
//        employeeRepo.save(testEmployee);
//    }

    @Test
    public  void createEmployee(){
        var emp =  employeeRepo.findById(1);
        assertNotNull(emp);
        assertEquals("Davolio",emp.get().last_name);
    }
}
