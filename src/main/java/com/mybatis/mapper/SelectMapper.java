package com.mybatis.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * 根据id来查询用户
     */
    List<User> getUserById(@Param("id") Integer id);

    /**
     * 统计行数
     */
    Integer getAllCount();

    /**
     * 根据id来查询用户（map）
     */
    Map<String ,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户为map集合
     */
    List<Map<String,Object>> getAllUserToMap();
}

