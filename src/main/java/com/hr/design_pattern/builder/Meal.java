package com.hr.design_pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @auhor hurong
 * @Date 2020/3/16 0016 下午 21:56
 */
public class Meal {
    private List<Item> items=new ArrayList<>();

    public void addItem(Item a){
        items.add(a);
    }

    public void showItems(){
        for (Item item:items){
            item.name();
            System.out.println("打包方式："+item.packing().packing());
            System.out.println("价格："+item.price());
        }
    }
}
