package com.hr.design_pattern.iterator;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 5:15
 */
public class Main{
    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository(){{
            add("rong hu");
            add("jack ma");
            add("jack chen");
        }};

        Iterator it = nameRepository.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}