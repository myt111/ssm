package com.myt.mybatis;

import com.myt.mybatis.mapper.EmpMapper;
import com.myt.mybatis.pojo.Emp;
import com.myt.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmpTest {

    @Test
    public void empResultMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empById = mapper.getEmpById(2);
        System.out.println(empById);
    }

    @Test
    public void empResultEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByIdAndDept(1);
        System.out.println(emp);
    }

    @Test
    public void empResultEmpAndDeptOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByIdAndDeptStep(1);
        System.out.println(emp);
    }

}
