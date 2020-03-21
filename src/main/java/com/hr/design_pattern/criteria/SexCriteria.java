package com.hr.design_pattern.criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 23:06
 */
public class SexCriteria implements Criteria{
    int sex;

    public SexCriteria(int sex) {
        this.sex = sex;
    }

    @Override
    public List<Person> meet(List<Person> personList) {
        return personList.stream().filter(p->sex==p.getSex()).collect(Collectors.toList());
    }
}
