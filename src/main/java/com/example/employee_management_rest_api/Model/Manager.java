package com.example.employee_management_rest_api.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Data
@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer managerId;
    private String managerName;

    @OneToOne(mappedBy = "manager")
    private Employee employee;

}