package com.myt.mybatis;

import com.myt.mybatis.mapper.DeptMapper;
import com.myt.mybatis.mapper.EmpMapper;
import com.myt.mybatis.pojo.Dept;
import com.myt.mybatis.pojo.Emp;
import com.myt.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DeptTest {
    @Test
    public void deptDEmp(){

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptEmpByDid = mapper.getDeptEmpByDid(1);
        System.out.println(deptEmpByDid);

    }
}
