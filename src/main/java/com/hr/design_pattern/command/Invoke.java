package com.hr.design_pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 12:04
 */
public class Invoke {
    List<Sql> sqls=new ArrayList<>();

    public void putCmd(Sql sql){
        sqls.add(sql);
    }

    public void executeBatch(){
        sqls.forEach(r->{r.execute();});
    }
}