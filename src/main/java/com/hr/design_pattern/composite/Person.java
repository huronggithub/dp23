package com.hr.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/19 0019 上午 10:09
 */
public class Person {
    String name;
    int age;
    List<Person> personList=new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public void del(Person person){
        personList.remove(person);
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

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personList=" + personList +
                '}';
    }


    public static void main(String[] args) {
        Person ceo=new Person(){{
            setName("ceo");
            setAge(60);
        }};

        Person cto=new Person(){{
            setName("cto");
            setAge(46);
        }};

        Person cfo=new Person(){{
            setName("cfo");
            setAge(20);
        }};

        ceo.add(cto);
        ceo.add(cfo);
        System.out.println(ceo.toString());

        ceo.del(cto);
        System.out.println(ceo.toString());
    }
}