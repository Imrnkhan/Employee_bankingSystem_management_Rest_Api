package com.example.employee_management_rest_api.controller;


import com.example.employee_management_rest_api.Model.Employee;
import com.example.employee_management_rest_api.Model.Manager;
import com.example.employee_management_rest_api.exceptions.EmployeeException;
import com.example.employee_management_rest_api.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get-employees/{id}")
    public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable("id") Integer id) throws EmployeeException {
        Employee emps= employeeService.getEmployeeById(id);
        return new ResponseEntity<Employee>(emps, HttpStatus.FOUND);
    }

    @GetMapping("/get-employee-manager/{id}")
    public ResponseEntity<Manager> getEmpReportingManagerHandler(@PathVariable("id") Integer id) throws EmployeeException{
        Manager manager= employeeService.findEmployeeReportingManager(id);
        return new ResponseEntity<Manager>(manager,HttpStatus.FOUND);
    }

}