package com.demo.annotation03.bean.scope;

import com.demo.annotation03.bean.scope.config.MainConfig;
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

        Person person = ctx.getBean("person", Person.class);
        Person person2 = ctx.getBean("person", Person.class);
        System.out.println(person==person2);
    }

    @Test
    public void test2(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
    }
}
