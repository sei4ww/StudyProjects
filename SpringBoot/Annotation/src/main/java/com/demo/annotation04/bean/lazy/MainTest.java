package com.demo.annotation04.bean.lazy;

import com.demo.annotation04.bean.lazy.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 13:32
 */

public class MainTest {

    @Test
    public void test(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC容器创建完成");

        //第一次调用时创建
        Person person = ctx.getBean("person", Person.class);
        //第二次调用时, 由于是singleton, 所以直接引用, 不创建
        Person person2 = ctx.getBean("person", Person.class);
        //两次引用都是同一个对象
        System.out.println(person==person2);
    }
}
