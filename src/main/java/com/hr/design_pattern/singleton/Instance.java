package com.hr.design_pattern.singleton;

import java.time.Instant;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/16 0016 下午 1:58
 */
public class Instance {
    /**
     * static：因为getInstance方法是static的
     * private：防止被外部直接访问，强制走方法getInstance
     */
    private static Instance instance;
    /**
     * 复制被外部调用
     */
    private Instance() {
    }

    /**
     * 统一暴露接口,一定是public、static的
     * @return
     */
    public static synchronized Instance getInstance(){
        if(instance==null){
            instance=new Instance();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("业务处理中");
    }

    public static void main(String[] args) {
        Instance.getInstance().doSomething();
    }
}