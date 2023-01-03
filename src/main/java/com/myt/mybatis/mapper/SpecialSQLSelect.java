package com.myt.mybatis.mapper;

import com.myt.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLSelect {
    List<User> getUserByLike(@Param("mohu") String mohu);

    /*
    * 根据id批量删除数据
    * */
    void deleteAllUser(@Param("ids") String ids);

    /*
    * 查询某张表
    * */
    List<User> selectUserTable(@Param("tableName") String tableName);

    /*
    * 获取自增id主键
    * */
    void insertUser(User user);
}
