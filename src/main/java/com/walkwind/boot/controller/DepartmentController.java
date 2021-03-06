package com.walkwind.boot.controller;

import com.walkwind.boot.bean.Department;
import com.walkwind.boot.bean.Employee;
import com.walkwind.boot.service.DepartmentService;
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
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;


    @GetMapping("/dept/{id}")
    public Department getDeptById(@PathVariable("id") Integer id){
        Department department = departmentService.getDeptById(id);
        return department;
    }
}
