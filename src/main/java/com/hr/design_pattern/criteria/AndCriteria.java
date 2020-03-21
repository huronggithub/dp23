package com.hr.design_pattern.criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 23:06
 */
public class AndCriteria implements Criteria{
    private Criteria me;
    private Criteria other;

    public AndCriteria(Criteria me,Criteria other) {
        this.me=me;
        this.other = other;
    }

    @Override
    public List<Person> meet(List<Person> personList) {
        return other.meet(me.meet(personList));
    }
}
