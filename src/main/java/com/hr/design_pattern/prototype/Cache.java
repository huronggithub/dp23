package com.hr.design_pattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @auhor hurong
 * @Date 2020/3/16 0016 下午 22:27
 */
public class Cache {
    private static Map<Integer, AbsSharp> sharpMap=new HashMap<>();

    public static void loadCache(){
        sharpMap.put(1,new Circle());
        sharpMap.put(2,new Rectangle());
    }

    public static AbsSharp getSharp(Integer i){
        AbsSharp sharp = sharpMap.get(i);
        if(sharp!=null){
            return (AbsSharp) sharp.clone();
        }
        return null;
    }

    public static void main(String[] args) {
        Cache.loadCache();
        Cache.getSharp(1).draw();
        Cache.getSharp(1).draw();
        Cache.getSharp(2).draw();
    }
}
