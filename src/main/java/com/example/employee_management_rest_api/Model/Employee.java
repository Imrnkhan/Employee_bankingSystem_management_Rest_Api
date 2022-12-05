package com.example.employee_management_rest_api.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.catalina.Manager;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer emp_Id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Double salary;


    @OneToOne(cascade = CascadeType.ALL)
    private Manager manager;

}