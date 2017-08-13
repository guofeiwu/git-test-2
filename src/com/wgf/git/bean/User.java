package com.wgf.git.bean;

/**
 * Created by GuofeiWu on 2017/8/12.
 */
public class User {
    private int id;
    private int age;
    private String name;

    private String province;
    private String city;

    public void setCity(String city) {
        this.city = city;
    }

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
    
    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }
}
