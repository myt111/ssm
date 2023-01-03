package com.myt.mybatis;

import com.myt.mybatis.mapper.SelectMapper;
import com.myt.mybatis.pojo.User;
import com.myt.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {
    @Test
    public void testSelectById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> user = mapper.getAllUser();
        user.forEach(System.out::println);
    }
    @Test
    public void testSelectAll() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User userById = mapper.getUserById(2);
        System.out.println(userById);
    }


    @Test
    public void testGetCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }

    @Test
    public void testGetUserByIdToMaop() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> byIdToMap = mapper.getByIdToMap(2);
        System.out.println(byIdToMap);
    }

    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> list = mapper.getAllUserIdToMap();
        System.out.println(list);
    }

    @Test
    public void testGetAllUserToMap1() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getAllUserIdToMap1();

        /*{1={password=123, gender=男, id=1, age=14, email=123@qq.com, username=张三},
         2={password=root, gender=男, id=2, age=14, email=123@qq.com, username=root}}*/
        System.out.println(map);

    }

}
