package com.walkwind.boot;

import com.walkwind.boot.bean.Employee;
import com.walkwind.boot.mapper.EmployeeMapper;
import com.walkwind.boot.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class BootSenior01CacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate empRedisTemplate;


    @Test
    void contextLoads() {
        Employee emp = employeeMapper.getEmpById(2);
        empRedisTemplate.opsForValue().set("emp",emp);
    }
    @Test
    void contextLoads1() {
        stringRedisTemplate.opsForValue().append("msg","hello");
    }

}
