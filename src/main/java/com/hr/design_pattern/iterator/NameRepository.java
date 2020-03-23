package com.hr.design_pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 5:11
 */
public class NameRepository implements NameContainer {
    private List<String> names=new ArrayList<>();

    @Override
    public Iterator iterator() {
        return new NameIterator();
    }

    public void add(String name){
        names.add(name);
    }

    public void remove(String name){
        names.remove(name);
    }


    /**
     * 为什么使用内部类？保证可以访问NameRepository的属性（names）
     * @Description:
     * @Author: hurong
     * @Time: 2020/3/20 0020 下午 5:15
     */
    class NameIterator implements Iterator {
        private int location;

        public NameIterator() {
            this.location=0;
        }

        @Override
        public boolean hasNext() {
            return location<names.size();
        }

        @Override
        public Object next() {
            return names.get(location++);
        }
    }
}