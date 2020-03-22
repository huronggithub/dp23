package com.hr.design_pattern.template;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 14:44
 */
public abstract class Ball {

    protected abstract void init();

    protected abstract void startPlay();

    protected abstract void endPlay();

    /**
     * final：防止方法被覆盖
     */
    public final void play(){
        init();
        startPlay();
        endPlay();
    }
}
