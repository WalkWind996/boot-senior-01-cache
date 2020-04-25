package com.walkwind.boot.controller;

import com.walkwind.boot.bean.Employee;
import com.walkwind.boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-22-11:17
 **/
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        Employee empById = employeeService.getEmpById(id);
        return empById;
    }

    @GetMapping("/emp")
    public Employee updateEmp(Employee employee){
        Employee employee1 = employeeService.updateEmp(employee);
        return employee1;
    }

    @GetMapping("/delete/{id}")
    public void deleteEmpById(@PathVariable("id") Integer id){
        employeeService.deleteEmpById(id);
    }

}
