package com.demo.annotation02.component.componentscan.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 15:24
 */
public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //metadataReader: the metadata reader for the target class 被扫描的当前类的信息
        //metadataReaderFactory: a factory for obtaining metadata readers 可以获取其他类的信息

        //获取当前类注解信息
        AnnotatedTypeMetadata annotatedTypeMetadata = metadataReader.getAnnotationMetadata();

        //获取当前类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        //获取当前类资源(类的路径..等)
        Resource resource = metadataReader.getResource();

        //当前类名
        String className = metadataReader.getClassMetadata().getClassName();
        System.out.println("进入MyTypeFilter,遍历--->"+className);

        //当类名包含"er"后, 过滤结果为true
        if(className.contains("er")) {
            return true;
        }
        return false;
    }
}
