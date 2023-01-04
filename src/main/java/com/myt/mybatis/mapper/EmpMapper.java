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
    * 分布查询，多对一关系，多条对应一个关系，所有在pojo类中添加Dept属性
    * */
    Emp getEmpByIdAndDeptStep(@Param("empId") Integer empId);
    // Emp{empId=1, empName='张三', age=12, gender='男', deptId=1, dept=Dept{id=1, name='信息部', emps=null}}



}
