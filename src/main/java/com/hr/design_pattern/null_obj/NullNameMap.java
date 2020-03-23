package com.hr.design_pattern.null_obj;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 8:34
 */
public class NullNameMap extends NameMap {
    @Override
    public String getName() {
        System.out.println("method not support");
        return null;
    }

    @Override
    public boolean isNull() {
        return true;
    }


}