package com.demo.annotation03.bean.scope.config;

import com.demo.annotation03.bean.scope.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 13:34
 */
@Configuration
@Component
public class MainConfig {

    //scopeName = "prototype"       //多实例
    //scopeName = "singleton"       //单实例(默认)
    //scopeName = "request"         //同一次请求创建一个实例,需要web环境
    //scopeName = "session"         //同一个session创建一个实例,需要web环境
//    @Scope(scopeName = "prototype")
    @Bean
    public Person person() {
        System.out.println("给容器添加person bean");
        return new Person("张三", 25);
    }
}
