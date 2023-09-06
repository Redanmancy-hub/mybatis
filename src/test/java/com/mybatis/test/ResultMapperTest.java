package com.mybatis.test;

import com.mybatis.mapper.DeptMapper;
import com.mybatis.mapper.EmpMapper;
import com.mybatis.pojo.Dept;
import com.mybatis.pojo.Emp;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ResultMapperTest {
    @Test
    public void testGetAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empList = empMapper.getAllEmp();
        empList.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmpAndDept(1);
        System.out.println(emp);
    }

    @Test
    public void testDeptAndEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = deptMapper.getDeptAndEmp(1);
        System.out.println(dept);
    }
}
