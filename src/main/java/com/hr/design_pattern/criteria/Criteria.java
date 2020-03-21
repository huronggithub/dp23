package com.hr.design_pattern.criteria;

import java.util.List;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 23:02
 */
public interface Criteria {
    List<Person> meet(List<Person> personList);
}
