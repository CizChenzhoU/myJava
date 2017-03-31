package FactoryPattern;

/**
 *抽象工厂模式
 * chouchan
 * 第一部分： 抽象工厂
 * 一般来说，抽象工厂最简单形态也至少有4个元素：
 * 客户端（client）
 * 工厂（factory）
 * 产品A（product A）
 * 产品B（product B）
 */
public class AbstractFactoryPattern {
    //抽象食物
    interface Food{
        public String getFoodName();
    }
    //抽象餐具
    interface TableWare{
        public String getToolName();
    }
    // 抽象工厂
    interface KitchenFactory {
        public Food getFood();
        public TableWare getTableWare();
    }
    //具体食物 Apple 的定义如下
    static class Apple implements Food{
        public String getFoodName(){
            return "苹果";
        }
    }
    //具体餐具 knife 的定义如下
    static class Knife implements TableWare{
        public String getToolName(){
            return "刀子";
        }
    }
    // 以具体工厂 AKitchen 为例
    static class AKitchen implements KitchenFactory {
        public Food getFood() {
            return new Apple();
        }

        public TableWare getTableWare() {
            return new Knife();
        }
    }

    // 吃货要开吃了
    public void eat(KitchenFactory k) {
        System.out.println("一个人正在用 "+ k.getTableWare().getToolName()
                + " 吃 " + k.getFood().getFoodName());
    }

    public static void main(String[] args) {
        AbstractFactoryPattern fh = new AbstractFactoryPattern();
        KitchenFactory kf = new AKitchen();
        fh.eat(kf);
    }













}
