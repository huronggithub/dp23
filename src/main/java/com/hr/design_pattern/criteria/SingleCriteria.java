package com.hr.design_pattern.criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 23:06
 */
public class SingleCriteria implements Criteria{

    private final boolean single;

    public SingleCriteria(boolean single) {
        this.single = single;
    }

    @Override
    public List<Person> meet(List<Person> personList) {
        return personList.stream().filter(p->single==p.isSingle()).collect(Collectors.toList());
    }
}
