package com.hr.design_pattern.responsibility_chain;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 上午 10:15
 */
public abstract class AbsLog {
    public static final int ERROR=3;
    public static final int INFO=2;
    public static final int DEBUG=1;

    int level;

    AbsLog nextLog;

    public AbsLog(int level) {
        this.level = level;
    }

    public void setNextLog(AbsLog nextLog) {
        this.nextLog = nextLog;
    }

    public void log(int level,Object msg){
        if(this.level>=level){
            doLog(msg);
        }
        if(this.nextLog!=null){
            nextLog.log(level,msg);
        }
    }
    abstract protected void doLog(Object msg);

}