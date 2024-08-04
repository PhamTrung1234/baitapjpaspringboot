package com.example.baitap1.service.Imp;


import com.example.baitap1.dto.DepartmentDTO;
import com.example.baitap1.dto.EmployeeDTO;

import com.example.baitap1.entity.Employee;
import com.example.baitap1.repository.EmployeeRepository;
import com.example.baitap1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<EmployeeDTO> getAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDTO> dtos = new ArrayList<>();
        for (Employee employee : employees) {
            DepartmentDTO departmentDTO = new DepartmentDTO(employee.getDepartment().getId(),employee.getDepartment().getName());
            EmployeeDTO employeeDTO = new EmployeeDTO(employee.getId(),employee.getName(),departmentDTO);
            dtos.add(employeeDTO);
        }

        return dtos;
    }
}
