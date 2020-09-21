package com.demo.annotation06.Import.condition;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 17:23
 */
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //context: 判断条件使用的上下文
        //metadata: 当前标注了@Conditional的类或方法

        //获取到IOC使用的beanFactory
        ConfigurableBeanFactory beanFactory = context.getBeanFactory();

        //获取到类加载器
        ClassLoader classLoader = context.getClassLoader();

        //获取环境信息
        Environment env = context.getEnvironment();

        //获取到bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        //判断操作系统
        String osName = env.getProperty("os.name");
        if(osName.contains("linux")) {
            return true;
        }
        return false;
    }
}
