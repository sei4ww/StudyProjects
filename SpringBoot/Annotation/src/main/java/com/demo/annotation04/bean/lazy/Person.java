package com.demo.annotation04.bean.lazy;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 5:59
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("创建person实例");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void method() {
        System.out.println("测试");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
