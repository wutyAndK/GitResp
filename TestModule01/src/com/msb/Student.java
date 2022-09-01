package com.msb;

/**
 * @author wuty
 * @version 1.0
 * date 2022/9/2 0:11
 */
public class Student {
    private String name;
    String address;
    private String sex;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
