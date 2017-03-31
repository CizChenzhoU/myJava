package abstractFactoryPattern.kitchen;

import abstractFactoryPattern.KitchenFactory;
import abstractFactoryPattern.warehouse.Food;
import abstractFactoryPattern.warehouse.TableWare;
import abstractFactoryPattern.warehouse.impl.Apple;
import abstractFactoryPattern.warehouse.impl.Knife;

/**
 * 具体工厂
 * chouchan
 */
public class LilyKitchen implements KitchenFactory {
    public Food getFood() {
        return new Apple();
    }

    public TableWare getTableWare() {
        return new Knife();
    }
}
