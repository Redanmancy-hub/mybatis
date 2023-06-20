package com.mybatis.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// mybatis中有面向接口编程的功能
public interface UserMapper {
    /**
     * mybatis面向接口编程的两个一致：
     *1.映射文件的namespace要和mapper接口的全类名保持一致
     *2.映射文件中的SQL语句的id要和mapper接口中的方法名一致
     *
     * 表--实体类--mapper接口--映射文件
     */

    /*
     * 添加用户信息
     */
    int insertUser(@Param("user") User user);

    /**
     * 修改信息
     */
    void updateUser();

    /**
     * 删除信息
     */
    void deleteUser();

    /**
     * 根据用户id查询信息
     */
    User getUserById();

    /**
     * 查询全部数据
     */
    List<User> getAllUser();
}