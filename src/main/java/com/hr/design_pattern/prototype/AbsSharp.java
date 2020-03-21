package com.hr.design_pattern.prototype;

/**
 * @auhor hurong
 * @Date 2020/3/16 0016 下午 22:25
 */
public abstract class AbsSharp implements Cloneable {
    abstract void draw();

    @Override
    protected Object clone(){
        Object clone =null;
        try {
            clone=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
