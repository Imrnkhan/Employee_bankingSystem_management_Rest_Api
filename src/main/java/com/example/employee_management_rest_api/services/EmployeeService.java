package com.example.employee_management_rest_api.services;

import com.example.employee_management_rest_api.Model.Employee;
import com.example.employee_management_rest_api.Model.Manager;
import com.example.employee_management_rest_api.exceptions.EmployeeException;

public class EmployeeService {

    public Employee getEmployeeById(Integer id) throws EmployeeException ;

    public Manager findEmployeeReportingManager(Integer id) throws EmployeeException;
}
