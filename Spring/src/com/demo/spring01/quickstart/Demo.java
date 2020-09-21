package com.demo.spring01.quickstart;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.sql.SQLOutput;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 5:59
 */
public class Demo {
    public static void main(String[] args) {
        //创建spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext("src/applicationContext2.xml");
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

        //获取资源
        Student student = applicationContext.getBean("Student", Student.class);
        Student student2 = applicationContext.getBean("Student", Student.class);
        Student student3 = beanFactory.getBean("Student", Student.class);

        //IOC 输出
        student.method();
        student2.method();
        student3.method();

        //DI 输出
        System.out.println(student.toString());
    }
}
