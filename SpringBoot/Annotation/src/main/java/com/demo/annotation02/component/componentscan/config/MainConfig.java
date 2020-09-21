package com.demo.annotation02.component.componentscan.config;

import com.demo.annotation02.component.componentscan.Person;
import com.demo.annotation02.component.componentscan.filter.MyTypeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 13:34
 */
@Configuration
//指定要扫描的包
//@ComponentScan(value="com.demo.annotation02.component")
//@ComponentScan继承@Repeatable                                                       //表示可以重复使用
//@ComponentScans(value={@ComponentScan(value="com.demo.annotation02.component")})   //同样的效果

//指定要扫描的包, 并排除指定的type
//excludeFilters = {@Filter(type= FilterType.ANNOTATION)}       //按照注解排除
//excludeFilters = {@Filter(type= FilterType.ASPECTJ)}          //按照ASPECTJ排除
//excludeFilters = {@Filter(type= FilterType.ASSIGNABLE_TYPE)}  //按照类型排除
//excludeFilters = {@Filter(type= FilterType.Custom)}           //自定义排除
//excludeFilters = {@Filter(type= FilterType.REGEX)}            //按照正则排除

//指定要扫描的包, 并只包含指定的type
//useDefaultFilters = false                                     //使用前需要先关闭defaultFilters
//includeFilters = {@Filter(type= FilterType.ANNOTATION)}       //按照注解加载
//includeFilters = {@Filter(type= FilterType.ASPECTJ)}          //按照ASPECTJ加载
//includeFilters = {@Filter(type= FilterType.ASSIGNABLE_TYPE)}  //按照类型加载
//includeFilters = {@Filter(type= FilterType.Custom)}           //自定义加载
//includeFilters = {@Filter(type= FilterType.REGEX)}            //按照正则加载

@Component

//排除controller和service注解
//@ComponentScan(value="com.demo.annotation02.component",
//        excludeFilters = {@Filter(type= FilterType.ANNOTATION, classes={Controller.class, Service.class})})

//只加载controller注解
//@ComponentScan(value="com.demo.annotation02.component",
//        useDefaultFilters = false,
//        includeFilters = {@Filter(type=FilterType.ANNOTATION, classes={Controller.class})})

//只加载Controller注解和BookService类型
//@ComponentScan(value="com.demo.annotation02.component",
//        useDefaultFilters = false,
//        includeFilters = {
//                @Filter(type=FilterType.ANNOTATION, classes={Controller.class}),
//                @Filter(type=FilterType.ASSIGNABLE_TYPE, classes={BookService.class})
//        })

//只加载MyTypeFilter中自定义规则后的类, 规则为className包含"er"
@ComponentScan(value="com.demo.annotation02.component",
        useDefaultFilters = false,
        includeFilters = {
                @Filter(type=FilterType.CUSTOM, classes = {MyTypeFilter.class})
        })
public class MainConfig {

    //给容器注册一个Bean,类型是返回值类型,id为方法名
    @Bean
    public Person person() {
        return new Person("李四", 20);
    }
}
