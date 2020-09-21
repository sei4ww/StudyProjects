package com.demo.annotation02.component.componentscan;

import com.demo.annotation02.component.componentscan.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 13:32
 */

public class MainTest {

    @Test
    public void test(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] names = ctx.getBeanDefinitionNames();
        System.out.println("------------ctx.getBeanDefinitionNames()");
        Arrays.asList(names).forEach(System.out::println);
    }
}
