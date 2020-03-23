package com.hr.design_pattern.responsibility_chain;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 上午 10:18
 */
public class DebugLog extends AbsLog {
    public DebugLog() {
        super(AbsLog.DEBUG);
    }

    @Override
    public void doLog(Object msg) {
        System.out.println("debug :"+msg.toString());
    }
}