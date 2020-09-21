package com.demo.annotation06.Import.config;

import com.demo.annotation06.Import.Color;
import com.demo.annotation06.Import.Person;
import com.demo.annotation06.Import.Red;
import com.demo.annotation06.Import.condition.LinuxCondition;
import com.demo.annotation06.Import.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 13:34
 */
@Configuration
@Component

//导入组件, ID默认是全类名
@Import({Color.class, Red.class})
public class MainConfig {
    //如果是windows系统,注册bill,
    //如果是lunux系统,注册linux

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01() {
        return new Person("Bill Gates", 63);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02() {
        return new Person("linus", 42);
    }

    @Bean
    public Person person() {
        System.out.println("给容器添加person bean");
        return new Person("张三", 25);
    }
}
