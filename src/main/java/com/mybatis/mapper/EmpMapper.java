package com.mybatis.mapper;

import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    /**
     * 查询所有员工的信息
     */
    List<Emp> getAllEmp();

    /**
     * 查询员工以及员工对应的部门信息
     */
    Emp getEmpAndDept(@Param("eid") int eid);
}
