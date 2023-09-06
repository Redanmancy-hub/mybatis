package com.mybatis.test;

import com.mybatis.mapper.SqlMapper;
import com.mybatis.pojo.User;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SqlMapperTest {
    @Test
    public void getLikeUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        List<User> list = sqlMapper.getLikeUsername("何");
        System.out.println(list);
    }

    @Test
    public void deleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        int result = sqlMapper.deleteMore("1,2,15");
        System.out.println(result);
    }

    @Test
    public void getUserByTableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        List<User> list = sqlMapper.getUserByTableName("t_user");
        System.out.println(list);
    }
}
