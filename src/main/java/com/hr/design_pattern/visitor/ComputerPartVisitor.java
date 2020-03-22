package com.hr.design_pattern.visitor;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 15:20
 */
public class ComputerPartVisitor implements PartVisitor {
    @Override
    public void visitor(Mouse mouse) {
        System.out.println("显示鼠标");
    }

    @Override
    public void visitor(Keyboard keyboard) {
        System.out.println("键盘");
    }


    @Override
    public void visitor(Monitor monitor) {
        System.out.println("显示显示器");
    }

    @Override
    public void visitor(Computer computer) {
        System.out.println("显示电脑");
    }

    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.accept(new ComputerPartVisitor());
    }

}
