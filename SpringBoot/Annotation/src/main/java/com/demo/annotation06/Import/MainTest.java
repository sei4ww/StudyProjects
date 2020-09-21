package com.demo.annotation06.Import;

import com.demo.annotation06.Import.config.MainConfig;
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
        String[] classNames = ctx.getBeanDefinitionNames();
        Arrays.asList(classNames).forEach(System.out::println);
    }
}
