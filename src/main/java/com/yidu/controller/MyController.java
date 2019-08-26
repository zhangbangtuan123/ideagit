package com.yidu.controller;

import com.yidu.pojo.Emp;
import com.yidu.server.EmpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bootDemo")
public class MyController {
    @Autowired
    private EmpServer empServer;

    @RequestMapping("{empno}")
    public Emp getEmpById(@PathVariable String empno){
        Emp emp = empServer.getEmpById(empno);
        return emp;
    }
}
