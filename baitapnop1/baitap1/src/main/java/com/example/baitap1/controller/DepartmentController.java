package com.example.baitap1.controller;

import com.example.baitap1.service.EmployeeService;
import com.example.baitap1.service.Imp.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empl")
public class DepartmentController {
    @Autowired
    private EmployeeServiceImp employeeService;

    @GetMapping()
    public ResponseEntity<?> showList() {
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.OK);
    }
}
