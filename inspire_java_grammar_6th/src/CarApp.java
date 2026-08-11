import features.car.Car;

public class CarApp {
    public static void main(String[] args) {
        Car audi = new Car(); // 주소 값을 갖기 위한 객체 생성
        // audi.brand = "아우디";
        audi.setBrand("AUDI");
        // System.out.println("brand : " + audi.brand);
        System.out.println("brand : " + audi.getBrand());

        ////////////////
        Car bmw = new Car("BMW");
        // System.out.println("brand : " + bmw.brand);
        System.out.println("brand : " + bmw.getBrand());

        ///////////////
        Car benz = new Car("BENZ", "C200");
        // System.out.println("brand : " + benz.brand);
        // System.out.println("model : " + benz.model);
        System.out.println("brand : " + benz.getBrand());
        System.out.println("model : " + benz.getModel());

        String carInfo = benz.carInfo();
        System.out.println("carInfo : " + carInfo);
    }
}
