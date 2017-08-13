package com.wgf.git.bean;

/**
 * Created by GuofeiWu on 2017/8/12.
 */
public class User {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 无参构造函数
     */
    public User() {
    }
    public User(int age) {
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    /**
     * 两个参数的构造函数
     * @param age 年龄
     * @param name 姓名
     */
    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
