package com.hr.design_pattern.builder;

/**
 * @auhor hurong
 * @Date 2020/3/16 0016 下午 22:00
 */
public class Builder {

    public Meal getVergMeal(){
        Meal meal=new Meal();
        meal.addItem(new VergBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal getChickenMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new CocaCola());
        return meal;
    }

    public static void main(String[] args) {
        Builder builder=new Builder();
        Meal chickenMeal = builder.getChickenMeal();
        chickenMeal.showItems();
        System.out.println("===================");
        Meal vergMeal = builder.getVergMeal();
        vergMeal.showItems();
    }
}
