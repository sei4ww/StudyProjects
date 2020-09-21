package com.demo.annotation05.conditional;

import com.demo.annotation05.conditional.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 13:32
 */

public class MainTest {

    @Test
    public void test(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        Environment env = ctx.getEnvironment();
        String osName = env.getProperty("os.name");
        System.out.println(osName);

        String[] classNames = ctx.getBeanNamesForType(Person.class);
        Arrays.asList(classNames).forEach(System.out::println);

        Map<String, Person> persons = ctx.getBeansOfType(Person.class);
        System.out.println(persons);


    }
}
