package com.myt.mybatis;

import com.myt.mybatis.mapper.UserMapper;
import com.myt.mybatis.pojo.User;
import com.myt.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    @Test
    public void getUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 返回单条数据值，返回多条？？？
        User root = mapper.getUserByUsername("root");
        System.out.println(root);

    }

    @Test
    public void checkLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 返回单条数据值，返回多条？？？
//        List list = new ArrayList<User>();
        User user = mapper.checkLogin("root", "root");
        System.out.println(user);

    }


    @Test
    public void checkLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 返回单条数据值，返回多条？？？
//        List list = new ArrayList<User>();
        Map<String,Object> map = new HashMap<>();
        map.put("username","root");
        map.put("password","root");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);

    }


    @Test
    public void testInsertOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 返回单条数据值，返回多条？？？
        User user = new User(null,"myt","myt",12,"男","123@qq.com");
        mapper.insertOne(user);
    }

    @Test
    public void checkLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.checkLoginByParam("root", "root");
        System.out.println(user);
    }


}
