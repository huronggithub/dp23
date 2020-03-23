package com.hr.design_pattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 7:16
 */
public class Employee {
    List<Observe> observeList=new ArrayList();

    String name;
    int oldVal,val;

    public Employee(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.oldVal=this.val;
        this.val = val;
        notifyAllObserve();
    }

    public void addObserve(Observe observe){
        observeList.add(observe);
    }


    private void notifyAllObserve(){
        observeList.forEach(e->e.observe());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}