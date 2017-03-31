package FactoryPattern;

/**
 * 装饰器模式
 * chouchan
 */
public class DecoratorPattern {
    //抽象类 Girl
    public static abstract class Girl{
        String description = "no particular";

        public String getDescription(){
            return description;
        }
    }
    // 美国女孩
    public static class AmericanGirl extends Girl{
        public AmericanGirl(){
            description = "+AmericanGirl";
        }
    }
    //国产妹子
    public class ChineseGirl extends Girl{
        public ChineseGirl(){
            description = "+ChineseGirl";
        }
    }
    //装饰者
    public static abstract  class GirlDecorator extends Girl{
        public abstract String getDescription();
    }
    //下面以美国女孩实例
    //给美国女孩加上金发
    public static class GoldenHair extends GirlDecorator{

        private Girl girl;

        public GoldenHair(Girl g){
            girl = g;
        }

        @Override
        public String getDescription() {
            return girl.getDescription()+"+with golden hair";
        }
    }
    //加上身材高大特性
    public static class Tall extends GirlDecorator{

        private Girl girl;

        public Tall(Girl g){
            girl = g;
        }

        @Override
        public String getDescription() {
            return girl.getDescription()+"+is very tall";
        }
    }

    public static void main(String[] args){
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());

        GoldenHair g2 = new GoldenHair(g1);
        System.out.println(g2.getDescription());

        Tall g3 = new Tall(g2);
        System.out.println(g3.getDescription());
    }
}



















