package com.yidu.server;

import com.yidu.mapper.EmpMapper;
import com.yidu.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServer {
    @Autowired
    private EmpMapper empMapper;

    public Emp getEmpById(String empno){
        System.out.println("111retertertrertffds1");
        return empMapper.selectByPrimaryKey(empno);
    }

}
