package com.hr.design_pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 23:10
 */
public class Main {
    public static void main(String[] args) {
        Person p1=new Person(){{
            setAge(10);
            setName("张三");
            setSex(1);
            setSingle(true);
        }};

        Person p2=new Person(){{
            setAge(45);
            setName("李四");
            setSex(0);
            setSingle(false);
        }};

        Person p3=new Person(){{
            setAge(33);
            setName("王五");
            setSex(0);
            setSingle(true);
        }};

        Person p4=new Person(){{
            setAge(68);
            setName("赵六");
            setSex(1);
            setSingle(true);
        }};

        List<Person> personList=new ArrayList(){{
            add(p1);
            add(p2);
            add(p3);
            add(p4);
        }};

        Criteria ageCriteria=new AgeCriteria(18);
        Criteria sex0Criteria=new SexCriteria(0);
        Criteria sex1Criteria=new SexCriteria(1);

        Criteria singleCriteria=new SingleCriteria(true);
        Criteria notSingleCriteria=new SingleCriteria(false);

        Criteria singleAdult0=new AndCriteria(new AndCriteria(ageCriteria,sex0Criteria),singleCriteria);
        System.out.println("==============age>18 and sex=0 and isSingle=============");
        singleAdult0.meet(personList).forEach(e->System.out.println(e));
        System.out.println();

        Criteria sex1OrnotSingle=new OrCriteria(sex1Criteria,notSingleCriteria);
        System.out.println("==============sex=1 or !isSingle=============");
        sex1OrnotSingle.meet(personList).forEach(e->System.out.println(e));
        System.out.println();

        System.out.println("==============both=============");
        new AndCriteria(singleAdult0,sex1OrnotSingle).meet(personList).forEach(e->System.out.println(e));
        System.out.println();

        System.out.println("==============combine =============");
        new OrCriteria(singleAdult0,sex1OrnotSingle).meet(personList).forEach(e->System.out.println(e));
    }



}
