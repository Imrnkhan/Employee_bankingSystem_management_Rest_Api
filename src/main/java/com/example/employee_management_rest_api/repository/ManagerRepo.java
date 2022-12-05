package com.example.employee_management_rest_api.repository;

import com.example.employee_management_rest_api.Model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepo extends JpaRepository<Manager, Integer> {
}