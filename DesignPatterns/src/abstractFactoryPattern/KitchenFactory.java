package abstractFactoryPattern;

import abstractFactoryPattern.warehouse.Food;
import abstractFactoryPattern.warehouse.TableWare;

/**
 * 抽象工厂
 * chouchan
 */
public interface KitchenFactory {
    //获得食物
    public Food getFood();
    //获得餐具
    public TableWare getTableWare();
}
