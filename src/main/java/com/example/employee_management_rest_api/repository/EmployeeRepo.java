package com.example.employee_management_rest_api.repository;

import com.example.employee_management_rest_api.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


    }

