package com.myt.mybatis.mapper;

import com.myt.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    Emp getEmpById(@Param("empId") Integer empId);

    /*
    * 级联
    * */
    Emp getEmpByIdAndDept(@Param("empId") Integer empId);

    /*
    * 分布查询
    * */
    Emp getEmpByIdAndDeptStep(@Param("empId") Integer empId);
}
