package com.myt.mybatis.mapper;

import com.myt.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;


/*
* 获取参数值两种方式 #{} 占位符赋值？ ${} 字符串拼接，有''单引号问题
* */
public interface UserMapper {
    /*
    * 根据用户名查询数据
    * */
    User getUserByUsername(String username);
    /*
    * 检测登录
    * */
    User checkLogin(String username,String password);

    /*
    * 通关Map方式传输
    * */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * 插入一条数据
     */
    void insertOne(User user);

    /*
    * 通关注解方法查询
    * */

    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
}
