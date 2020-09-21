package com.demo.spring01.quickstart;

/**
 * @Author Yongkang
 * @Creator 2020-09-21 5:59
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("初始化");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
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
