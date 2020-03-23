package com.hr.design_pattern.proxy;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 上午 10:06
 */
public class Proxy implements Actor {
    private Actor actor;

    public Proxy() {
        this.actor = new Jack();
    }

    @Override
    public void act() {
        actor.act();
    }

    public static void main(String[] args) {
        Proxy proxy=new Proxy();
        proxy.act();
    }
}