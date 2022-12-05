package com.example.employee_management_rest_api.controller;


import com.example.employee_management_rest_api.Model.Employee;
import com.example.employee_management_rest_api.exceptions.ManagerException;
import com.example.employee_management_rest_api.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("/get-all-reportees/{id}")
    public ResponseEntity<Employee> getEmployeeReportingManagerHandler(@PathVariable("id") Integer id) throws ManagerException {
        Employee emp= managerService.findEmployeeReportingManager(id);
        return new ResponseEntity<Employee>(emp, HttpStatus.FOUND);
    }

}