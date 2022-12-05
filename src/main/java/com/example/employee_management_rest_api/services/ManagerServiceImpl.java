package com.example.employee_management_rest_api.services;

import com.example.employee_management_rest_api.Model.Employee;
import com.example.employee_management_rest_api.Model.Manager;
import com.example.employee_management_rest_api.exceptions.ManagerException;
import com.example.employee_management_rest_api.repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManagerServiceImpl {

    @Autowired
    private ManagerRepo managerDao;

    @Override
    public Employee findEmployeeReportingManager(Integer id) throws ManagerException {
        Optional<Manager> opt = managerDao.findById(id);

        if (opt.isPresent()) {

            Manager manager = opt.get();

            return manager.getEmployee();
        }

        else
            throw new ManagerException("No employee for manager ID: "+id);
    }

}
