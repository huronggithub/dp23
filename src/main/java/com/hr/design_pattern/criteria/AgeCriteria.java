package com.hr.design_pattern.criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 23:06
 */
public class AgeCriteria implements Criteria{
    int lowestAge;

    public AgeCriteria(int sex) {
        this.lowestAge = lowestAge;
    }

    @Override
    public List<Person> meet(List<Person> personList) {
        return personList.stream().filter(p->lowestAge<=p.getAge()).collect(Collectors.toList());
    }
}
