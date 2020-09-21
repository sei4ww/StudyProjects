package com.demo.annotation01.bean;

import com.demo.annotation01.bean.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 13:32
 */

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = ctx.getBean("person", Person.class);
        System.out.println("------------ctx.getBean()");
        System.out.println(person);

        String[] names = ctx.getBeanDefinitionNames();
        System.out.println("------------ctx.getBeanDefinitionNames()");
        Arrays.asList(names).forEach(System.out::println);

        String[] names2 = ctx.getBeanNamesForType(Person.class);
        System.out.println("------------ctx.getBeanNamesForType()");
        Arrays.asList(names2).forEach(System.out::println);
    }
}
