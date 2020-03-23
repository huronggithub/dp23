package com.hr.design_pattern.null_obj;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 8:34
 */
public class RealNameMap extends NameMap {
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}