package com.hr.design_pattern.criteria;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 23:03
 */
public class Person {
    int sex;
    int age;
    String name;
    boolean isSingle;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
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

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex=" + sex +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", isSingle=" + isSingle +
                '}';
    }
}
