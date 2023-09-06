package com.mybatis.test;

import com.mybatis.mapper.SelectMapper;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class SelectMapperTest {

    @Test
    public void getUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getUserById(14));
    }

    @Test
    public void getUserAll(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getAllCount());
    }

    @Test
    public void getUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getUserByIdToMap(14));
    }

    @Test
    public void getAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getAllUserToMap());
    }
}
