package com.example.employee_management_rest_api.services;

import com.example.employee_management_rest_api.Model.Employee;
import com.example.employee_management_rest_api.Model.Manager;
import com.example.employee_management_rest_api.exceptions.EmployeeException;
import com.example.employee_management_rest_api.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepo employeeDao;

    @Override
    public Employee getEmployeeById(Integer id) throws EmployeeException {
        Optional<Employee> opt= employeeDao.findById(id);

        if(opt.isPresent()) {
            Employee emp= opt.get();
            return emp;
        }
        else {
            throw new EmployeeException("Employee Not Found with ID: "+id);
        }
    }

    @Override
    public Manager findEmployeeReportingManager(Integer id) throws EmployeeException {
        Optional<Employee> opt= employeeDao.findById(id);
        if(opt.isPresent()) {
            Employee emp= opt.get();
            return emp.getManager();
        }

        else {
            throw new EmployeeException("Employee Not present with ID: "+id);
        }

    }
}
