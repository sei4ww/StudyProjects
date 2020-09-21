package com.demo.annotation04.bean.lazy.config;

import com.demo.annotation04.bean.lazy.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 13:34
 */
@Configuration
@Component
public class MainConfig {

    @Lazy
    @Bean
    public Person person() {
        System.out.println("给容器添加person bean");
        return new Person("张三", 25);
    }
}
