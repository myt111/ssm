package com.myt.mybatis.mapper;

import com.myt.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    /*

    * 分布式查询第二步

    * */
    Dept getEmpByIdAndDeptStepTwo(@Param("deptId") Integer deptId);

    /*
    * 一对多关系，一个部门对应多个员工，所以用List封装emp员工信息
    * */
    Dept getDeptEmpByDid(@Param("id") int id);

    //Dept{id=1, name='信息部', emps=[Emp{empId=1, empName='张三', age=12, gender='男', deptId=1, dept=null}, Emp{empId=4, empName='赵六', age=11, gender='男', deptId=1, dept=null}, Emp{empId=5, empName='ml', age=11, gender='女', deptId=1, dept=null}]}
}
