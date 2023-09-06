package com.mybatis.mapper;

import com.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * 部门以及部门中所有员工信息
     */
    Dept getDeptAndEmp(@Param("did") Integer did);
}
