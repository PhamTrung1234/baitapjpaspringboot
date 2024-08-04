package com.example.baitap1.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "department")
public class Department {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     @Column(name = "name")
     private String name;
     @OneToMany(mappedBy = "department")
     private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
