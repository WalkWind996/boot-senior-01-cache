package com.walkwind.boot.service;

import com.walkwind.boot.bean.Department;
import com.walkwind.boot.bean.Employee;
import com.walkwind.boot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-24-14:36
 **/
@CacheConfig(cacheNames = "dept",cacheManager = "deptCacheManager")
@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Cacheable(key = "#id")
    public Department getDeptById(Integer id) {
        Department department = departmentMapper.getDeptById(id);
        return department;
    }
}
