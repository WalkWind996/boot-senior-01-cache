package com.walkwind.boot.mapper;

import com.walkwind.boot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-19-11:24
 **/
@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
