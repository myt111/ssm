package com.myt.mybatis;

import com.myt.mybatis.mapper.EmpMapper;
import com.myt.mybatis.pojo.Emp;
import com.myt.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EmpTest {

    @Test
    public void empResultMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empById = mapper.getEmpById(4);
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

    @Test
    public void empInsertEmps() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp1 = new Emp(1, "mm1", 13, "男", 1);
        Emp emp2 = new Emp(2, "mm2", 14, "男", 2);
        Emp emp3 = new Emp(3, "mm3", 15, "男", 3);
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(emps);
    }

    @Test
    public void empDeleteEmps() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Integer[] arr = new Integer[]{5,6,7};
        mapper.deleteMoreEmp(arr);

    }

}
