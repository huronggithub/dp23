package com.hr.design_pattern.responsibility_chain;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 上午 10:23
 */
public class Main {
    public static void main(String[] args) {
        AbsLog debugLog=new DebugLog();
        AbsLog infoLog=new InfoLog();
        AbsLog errorLog=new ErrorLog();
        debugLog.setNextLog(infoLog);
        infoLog.setNextLog(errorLog);
        System.out.println("-----------error level-------------");
        debugLog.log(AbsLog.ERROR,"error show");
        System.out.println("-----------info level-------------");
        debugLog.log(AbsLog.INFO,"info show");
        System.out.println("-----------debug level-------------");
        debugLog.log(AbsLog.DEBUG,"debug show");
    }
}