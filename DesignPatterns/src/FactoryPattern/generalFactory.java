package FactoryPattern;

/**
 * 普通工厂模式
 * chouchan
 */
public class generalFactory {
    //二者共同的接口
    public interface Human{
        public void eat();
        public void sleep();
        public void beat();
    }
    //创建实现类
    public static class Male implements Human{

        @Override
        public void eat() {
            System.out.println("Male can eat.");
        }

        @Override
        public void sleep() {
            System.out.println("Male can sleep.");
        }
        @Override
        public void beat() {
            System.out.print("Male can beat.");
        }
    }
    public static class Female implements Human{

        @Override
        public void eat() {
            System.out.println("Female can eat");
        }

        @Override
        public void sleep() {
            System.out.println("Female can sleep");
        }

        @Override
        public void beat() {
            System.out.println("Female can beat");
        }
    }
    // 创建普通工厂类
    public static class HumanFactory{
        public Human createHuman(String gender){
            if(gender.equals("male")){
                return new Male();
            }else if(gender.equals("female")){
                return new Female();
            }else{
                System.out.println("请输入正确的类型！");
                return null;
            }
        }
    }

    //工程测试类
    public static void main(String[] args){
        HumanFactory factory = new HumanFactory();
        Human male = factory.createHuman("male");
        male.eat();
        male.sleep();
        male.beat();
    }
}
