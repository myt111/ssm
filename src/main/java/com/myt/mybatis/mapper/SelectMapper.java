package com.myt.mybatis.mapper;

import com.myt.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /*
    * 根据Id返值
    * */
    User getUserById(@Param("id") Integer id);

    /*
    * 返回所有用户对象
    * */
    List<User> getAllUser();

    /*
    * 查询count()值
    * */
    Integer getCount();

    /*
    * 根据id查询一条数据封装成Map
    * */
    Map<String,Object> getByIdToMap(@Param("id") Integer id);

    /*
    * 返回多条Map集合数据，转为List集合
    * */
    List<Map<String,Object>> getAllUserIdToMap();

    /*
    * 通过注解的方式把Map中的数据放到Map集合里
    * 若查询的数据多条，转为Map集合
    * */
    @MapKey("id")
    Map<String,Object> getAllUserIdToMap1();
}
