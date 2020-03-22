package com.hr.design_pattern.visitor;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 15:05
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(PartVisitor partVisitor) {
        partVisitor.visitor(this);
    }
}