package FactoryPattern;

/**
 * 单例模式
 * 被单例的对象只能有一个实例存在。单例模式的实现方式是，一个类能返回对象的一个引用（永远是同一个）
 * 和一个获得该唯一实例的方法（必须是静态方法）。通过单例模式，我们可以保证系统中只有一个实例，从而
 * 在某些特定的场合下达到节约或者控制系统资源的目的。
 * K77
 * chouchan
 */
public class SingletonPattern {
    /*
    * 饿汉模式
    * 最常见，最简单的单例模式写法之一
    * 顾名思义，饿汉模式就是很饥渴，所以以上来就需要给它新建一个实例。但这种方法有一个明显的缺点，
    * 那就是不管有没有调用过获得实例的方法（本例中为getWife()）,每个都会新建一个实例。
    * */
    public static class Wife{
        //一开始就新建一个实例
        private static final Wife wife = new Wife();
        //默认构建方法
        private Wife(){}
        //获得实例的方法
        public static Wife getWife(){
            return wife;
        }

    }

    /*
    * 懒汉模式
    * 最常见、最简单的单例模式之二，跟饿汉模式是好基友，再次顾名思义，懒汉模式就是它很懒
    * 一开始不新建实例，只有当它需要使用的时候，会先判断实例是否为空，如果为空才会新建一
    * 个实例来使用
    * */
// 懒汉模式
    public static class Wife2 {

        //一开始没有新建实例
        private static Wife wife2;

        private Wife2() { }

        // 需要时再新建
        public static Wife getWife2() {
            if (wife2 == null) {
                wife2 = new Wife();
            }
            return wife2;
        }
    }

/*    3.线程安全的懒汉模式

    是不是感觉很简单？但是上面的懒汉模式却存在一个严重的问题。那就是如果有多个线程并行调用 getWife() 方法的时候，还是会创建多个实例，单例模式就失效了。

    Bug 来了，改改改！

    简单，我们在基本的懒汉模式上，把它设为线程同步（synchronized）就好了。synchronized 的作用就是保证在同一时刻最多只有一个线程运行，这样就避免了多线程带来的问题。*/
    public static class Wife3 {
        private static Wife wife;

        private Wife3() { }

        // 添加了 synchronized 关键字
        public static synchronized Wife getWife() {
            if (wife == null) {
                wife = new Wife();
            }
            return wife;
        }
    // 双重检验锁
    public static class Wife4 {
        private volatile static Wife wife;

        private Wife4() { }

        public static Wife getWife() {
            if (wife == null) {
                synchronized(Wife.class) {
                    if (wife == null) {
                        wife = new Wife();
                    }
                }
            }

            return wife;
        }
    }
}










}
