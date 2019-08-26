package com.yidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.yidu.mapper")
public class SpringDemoApplication {
    public static void main(String args[]){
        SpringApplication.run(SpringDemoApplication.class,args);
    }
}
