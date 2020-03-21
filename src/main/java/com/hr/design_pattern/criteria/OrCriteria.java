package com.hr.design_pattern.criteria;

import java.util.List;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 23:06
 */
public class OrCriteria implements Criteria{
    private Criteria me;
    private Criteria other;

    public OrCriteria(Criteria me, Criteria other) {
        this.me=me;
        this.other = other;
    }

    @Override
    public List<Person> meet(List<Person> personList) {
        List<Person> meet = other.meet(personList);
        meet.addAll(me.meet(personList));
        return meet;
    }
}
