public class VariableApp {
    /*
    변수? 데이터를 담는 그릇
    - 기본타입(값을 담는 그릇) <- literal value
        - 숫자형(정수 - byte, short, int, long, 실수 - float, double)
        - 문자형(char)
        - 논리형(bolean)
        - 문자열(String)
    - 참조타입(주소값을 담는 그릇)
        - 기본타입이 아닌 모든 것
    
    선언문법
    - 접근지정자(public, private) 변수타입 변수명 = literal value; -> 문장 마지막에 ;은 강제이다.
    ex) public int age = 10;

    위치에 따는 변수의 Scope
    - 클래스 블록에 선언 - 멤버변수
    - 메서드 블록에 선언 - 지역변수(변수타입 변수명 = literal value;)
    */
    public static void main(String[] args) {

        // 선언위치가 메서드 블럭에 있으므로 지역변수라 함.
        String name = "나유성";
        int age = 20;
        double height = 177.0;
        char gender = 'm';
        boolean isMarriage = false;

        System.out.println("name \t" + name);
        System.out.println("age \t" + age);
        System.out.println("height \t" + height);
        System.out.println("gender \t" + gender);
        System.out.println("isMarriage \t" + isMarriage);
    }
}
