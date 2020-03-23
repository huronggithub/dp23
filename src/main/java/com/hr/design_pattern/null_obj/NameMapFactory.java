package com.hr.design_pattern.null_obj;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 8:36
 */
public class NameMapFactory {
    private Map<String,NameMap> map=new HashMap(){{
        put("jack",new RealNameMap(){{
            setName("jack");
        }});
        put("james",new RealNameMap(){{
            setName("james");
        }});
    }};

    public NameMap getNameMap(String name){
        return map.getOrDefault(name,new NullNameMap());
    }
}