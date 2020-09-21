package com.demo.annotation01.bean.config;

import com.demo.annotation01.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 13:34
 */
@Configuration
@ComponentScan
public class MainConfig {

    //给容器注册一个Bean,类型是返回值类型,id为方法名
    @Bean
    public Person person() {
        return new Person("李四", 20);
    }
}
