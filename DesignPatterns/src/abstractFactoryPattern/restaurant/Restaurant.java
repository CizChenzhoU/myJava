package abstractFactoryPattern.restaurant;

import abstractFactoryPattern.KitchenFactory;
import abstractFactoryPattern.kitchen.LilyKitchen;

/**
 * chouchan
 */
public class Restaurant {
    // 吃货要开吃了
    public void eatApple(KitchenFactory k) {
        System.out.println("一个人正在用 "+ k.getTableWare().getToolName()
                + " 吃 " + k.getFood().getAppleFoodName());
    }
    public void eatPear(KitchenFactory k){
        System.out.println("一个人正在用 "+ k.getTableWare().getToolName()
                + " 吃 " + k.getFood().getPearFoodName());
    }

    public static void main(String[] args) {
        Restaurant fh = new Restaurant();
        KitchenFactory kf = new LilyKitchen();
        fh.eatPear(kf);
    }
}
