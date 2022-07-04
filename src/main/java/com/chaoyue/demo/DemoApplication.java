package com.chaoyue.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//本身就是spring的组件 标注这是springboot的应用
@SpringBootApplication
public class DemoApplication {

    //程序的主入口
    public static void main(String[] args) {
        //springboot 应用启动
        SpringApplication.run(DemoApplication.class, args);
    }

}
