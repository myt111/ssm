package com.myt.mybatis;

import com.myt.mybatis.mapper.SpecialSQLSelect;
import com.myt.mybatis.pojo.User;
import com.myt.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SpecialSQLSelectTest {

    @Test
    public void testSQLSelect() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLSelect mapper = sqlSession.getMapper(SpecialSQLSelect.class);
        List<User> a = mapper.getUserByLike("三");
        a.forEach(System.out::println);
    }

    @Test
    public void testDeleteSql() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLSelect mapper = sqlSession.getMapper(SpecialSQLSelect.class);
        mapper.deleteAllUser("9,10");
    }

    @Test
    public void testSelectUserTable() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLSelect mapper = sqlSession.getMapper(SpecialSQLSelect.class);
        List<User> t_user = mapper.selectUserTable("t_user");
        t_user.forEach(System.out::println);
    }

    @Test
    public void testInsertOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLSelect mapper = sqlSession.getMapper(SpecialSQLSelect.class);
        User user = new User(null,"李四","123",15,"男","123@email.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

}
