package com.myt.mybatis.mapper;

import com.myt.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /*
    * 分布式查询第二步
    * */
    Dept getEmpByIdAndDeptStepTwo(@Param("deptId") Integer deptId);
}
