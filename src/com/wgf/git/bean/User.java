package com.wgf.git.bean;

/**
 * Created by GuofeiWu on 2017/8/12.
 */
public class User {
    private int id;
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
<<<<<<< HEAD

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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 47fa578... 添加了toString方法
=======
=======
>>>>>>> develop

    public User(int age) {
        this.age = age;
    }
>>>>>>> develop
=======

    public User(String name) {
        this.name = name;
    }
<<<<<<< HEAD
>>>>>>> develop
=======
=======
>>>>>>> parent of 451040b... 带有年龄的构造函数
>>>>>>> develop
}
