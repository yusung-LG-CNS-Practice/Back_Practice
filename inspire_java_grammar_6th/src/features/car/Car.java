package features.car;

public class Car {

    private String brand; // 멤버 변수(전역)
    private String model;

    /*
     * constructor(생성자)
     * - 반환타입이 void가 아닌, 반환타입이 없다.
     * - 메서드의 이름이 클래스의 이름과 동일하다.
     * - 인스턴스 소유가 아니므로
     * - 일반 메서드처럼 호출되어질 수 없고
     * - 반드시 new 연산자 뒤에서만 호출되어야 한다.
     */
    public Car() {

    }

    /*
     * constructor overloading
     * - 생성자의 매개변수의 타입과 개수를 달리해서 선언된것
     * - 매개변수로 전달된 값을 멤버변수에 초기화
     * - this 인스턴스 생성 전 인스턴스를 지칭하는 키워드
     */
    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // 반환값이 존재, 매개변수가 존재하지 않는 메소드
    public String carInfo() {
        // return getBrand() + "\t" + getModel();
        return brand + "\t" + model;
    }
}
