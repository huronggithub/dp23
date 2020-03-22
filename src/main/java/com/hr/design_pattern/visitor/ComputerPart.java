package com.hr.design_pattern.visitor;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 14:58
 */
public interface ComputerPart {
    void accept(PartVisitor partVisitor);
}
