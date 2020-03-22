package com.hr.design_pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 15:05
 */
public class Computer implements ComputerPart {
    List<ComputerPart> computerParts=new ArrayList<>();

    public Computer() {
        this.computerParts.add(new Mouse());
        this.computerParts.add(new Keyboard());
        this.computerParts.add(new Monitor());
    }

    @Override
    public void accept(PartVisitor partVisitor) {
        computerParts.forEach(e->{e.accept(partVisitor);});
        partVisitor.visitor(this);
    }
}
