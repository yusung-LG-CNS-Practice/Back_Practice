package features.oop.abstraction;

/*
interface
- 상수, 추상메서드
- 객체 생성 x
- 표준역할을 담당
*/
public interface Flyer {

    public static final int STUDENT = 1;

    public abstract void fly();
    public abstract void takeOff();
    public abstract void landing();

}
