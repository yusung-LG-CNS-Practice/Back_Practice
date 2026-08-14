package features.oop.util;

/*
enum은 특수클래스로 정해진 상수집합
*/
public enum Flag {
    
    STUDENT(1), TEACHER(2), MANAGER(3);

    private final int flag;

    private Flag(int falg){
        this.flag = falg;
    }

    public int getFalg(){
        return this.flag;
    }
}
