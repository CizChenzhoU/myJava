package FactoryPattern;

/**
 * 适配器模式
 * chouchan
 */
public class AdapterPattern {

    // 国标插头
    public interface CnPluginInterface {
        void chargeWith2Pins();
    }

    // 实现国标插座的充电方法
    public static class CnPlugin implements CnPluginInterface {
        public void chargeWith2Pins() {
            System.out.println("charge with CnPlugin");
        }
    }

    // 在国家中内充电
    public static class Home {
        private CnPluginInterface cnPlugin;

        public Home() { }

        public Home(CnPluginInterface cnPlugin) {
            this.cnPlugin = cnPlugin;
        }

        public void setPlugin(CnPluginInterface cnPlugin) {
            this.cnPlugin = cnPlugin;
        }

        // 充电
        public void charge() {
            // 国标充电
            cnPlugin.chargeWith2Pins();
        }
    }

    // 国标测试类
    public static void main(String[] args) {
        CnPluginInterface cnPlugin = new CnPlugin();
        Home home = new Home(cnPlugin);
        // 会输出 “charge with CnPlugin”
        home.charge();
    }
}
