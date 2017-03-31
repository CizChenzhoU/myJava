package FactoryPattern;

/**
 * �������ģʽ
 * chouchan
 */
public class MultiFactory {
    //���߹�ͬ�Ľӿ�
    public interface Human{
        public void eat();
        public void sleep();
        public void beat();
    }
    //����ʵ����
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
    // ������ͨ������
    public static class HumanFactory{
        public Male createMale() {
            return new Male();
        }
        public Female createFemale() {
            return new Female();
        }
    }

    //���̲�����
    public static void main(String[] args){
        HumanFactory factory = new HumanFactory();
        Human male = factory.createMale();
        male.eat();
        male.sleep();
        male.beat();
    }
}
