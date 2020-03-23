package com.hr.design_pattern.abs_factory;

import com.hr.design_pattern.factory.ISharp;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/16 0016 下午 1:46
 */
public interface IFactory {
    ISharp getSharp(String sharp);
    IColor getColor(String color);
}