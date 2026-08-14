import features.oop.factory.BeanFactory;
import features.oop.tv.LgTV;
import features.oop.tv.SamsungTV;
import features.oop.tv.TV;


// 8월 14일 실습 코드
public class TvClientApp {

    public static void main(String[] args) {
        
        // SamsungTV tv = new SamsungTV();
        // tv.turnOn();

        // LgTV tv = new LgTV();
        // tv.turnOn();

        // TV tv = SamsungTV.getInstance();
        // System.out.println("debug >>>> tv address " + tv);
        // tv.turnOn();

        // TV tv1 = SamsungTV.getInstance();
        // System.out.println("debug >>>> tv1 address " + tv1);
        // tv1.turnOn();

        BeanFactory factory = BeanFactory.getInstance();
        TV tv = factory.getBrand("lg");
        tv.turnOn();
    }
}
