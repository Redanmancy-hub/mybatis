package com.mybatis.test;

import com.mybatis.mapper.DynamicSQLMapper;
import com.mybatis.pojo.Emp;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicSQLMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = dynamicSQLMapper.getEmpByCondition(new Emp(null,"",null,"",""));
        System.out.println(list);
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = dynamicSQLMapper.getEmpByChoose(new Emp(null,"张三",null,"",""));
        System.out.println(list);
    }

    @Test
    public void testDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int result = dynamicSQLMapper.deleteMoreByArray(new Integer[]{4,5,6});
        System.out.println(result);
    }

    @Test
    public void testInsertMoreByList(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null,"1",20,"男","1@qq.com");
        Emp emp2 = new Emp(null,"2",21,"男","1@qq.com");
        Emp emp3 = new Emp(null,"3",22,"女","1@qq.com");
        List<Emp> empList = Arrays.asList(emp1,emp2,emp3);
        int result = dynamicSQLMapper.insertMoreByList(empList);
        System.out.println(result);
    }
}
