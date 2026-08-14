package features.oop.abstraction;

// 8월 14일 실습 코드

// implements는 다중 implements로 할 수 있음
public class Superman extends Animal implements Flyer{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    public void takeOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeOff'");
    }

    @Override
    public void landing() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landing'");
    }
}
