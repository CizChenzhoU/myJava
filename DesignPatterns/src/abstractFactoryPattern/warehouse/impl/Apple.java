package abstractFactoryPattern.warehouse.impl;

import abstractFactoryPattern.warehouse.Food;

/**
 * chouchan
 */
public class Apple implements Food{
    @Override
    public String getAppleFoodName() {
        return "小苹果";
    }
    @Override
    public String getPearFoodName() {
        return "梨子";
    }
}
