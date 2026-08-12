package features.operator;

import features.blogs.domain.dto.BlogResponseDTO;
import features.blogs.domain.dto.BlogRequestDTO;

public class OperatorDemo {

    public OperatorDemo() {

    }

    // 반환 타입 없음, 매개변수 없음
    public void operator() {
        System.out.println(">>>> 산술연산자 : +, -, *, /, %, +=, -=, *=, /= etc...");
        System.out.println(">>>> 증감 연산자: ++, --");
        System.out.println(">>>> 삼항연산자 : (조건식) ? true : false");
        System.out.println(">>>> 논리연산자 : &, |, !, &&, ||");
        System.out.println(">>>> 관계연산자 : >, >=, <, <=, ==, !=");
    }

    // 반환 타입 존재, 매개변수 존재, 가장 많이 쓰이는 형태
    public BlogResponseDTO register(String title, String content, String email) {
        System.out.println(">>>> 반환타입 O, 매개변수 O");
        System.out.println(">>>> 전달된 매개변수를 가지고 업무로직을 처리");
        // BlogRequestDTO request = BlogRequestDTO.builder()
        // .title(title)
        // .content(content)
        // .email(email)
        // .build();
        if (email == "yusung052077@gmail.com") {
            return new BlogResponseDTO(201, "OK");
        } else {
            return new BlogResponseDTO(400, "FAIL");
        }
    }

    // 이렇게도 가능함
    public BlogResponseDTO register(BlogRequestDTO request) {
        if (request.getEmail() == "yusung052077@gmail.com") {
            return new BlogResponseDTO(201, "OK");
        } else {
            return new BlogResponseDTO(400, "FAIL");
        }
    }

    /*
     * Q1번)
     * 매개변수 number 값의 범위 : 1 ~ 3
     * - 1 : 금도끼, 2 : 은도끼, 3 : 쇠도끼
     * - 나무꾼 본인의 도끼가 1번이라고 하면 -> 산신령이 대다하길 "거짓말하는구나"
     * - 나무꾼 본인의 도끼가 2번이라고 하면 -> 산신령이 대다하길 "또 거짓말하는구나"
     * - 나무꾼 본인의 도끼가 3번이라고 하면 -> 산신령이 대다하길 "정직하구나 너에게 모든 도끼를 주겠다"
     */

    // 내가 푼 퀴즈 코드
    // public String woodMan(int number) {

    // switch (number) {
    // case 1:
    // return "거짓말하는구나";
    // case 2:
    // return "또 거짓말하는구나";
    // case 3:
    // return "정직하구나 너에게 모든 도끼를 주겠다";
    // default:
    // return "1 ~ 3 사이의 숫자를 입력해주세요.";
    // }
    // }

    // 강사님이 하신 퀴즈 코드 (if-else문)
    // public String woodMan(int number) {
    // if (number >= 1 && number <= 3) {
    // if (number == 1) {
    // return "거짓말하는구나";
    // } else if (number == 2) {
    // return "또 거짓말하는구나";
    // } else {
    // return "정직하구나 너에게 모든 도끼를 주겠다";
    // }
    // } else {
    // return "1 ~ 3 사이의 숫자를 입력해주세요.";
    // }
    // }

    // 강사님이 하신 퀴즈 코드 (삼항연산자)
    // public String woodMan(int number) {
    // // (조건식) ? true
    // // : (조건식) ? true
    // // : (조건식) ? true
    // // : false;
    // return (number < 1 || number > 3) ? "1 ~ 3 사이의 숫자를 입력해주세요."
    // : (number == 1) ? "거짓말하는구나"
    // : (number == 2) ? "또 거짓말하는구나"
    // : "정직하구나 너에게 모든 도끼를 주겠다";
    // }

    // 강사님이 하신 퀴즈 코드 (switch문)
    // public String woodMan(int number) {

    // switch (number) {
    // case 1:
    // return "거짓말하는구나";
    // case 2:
    // return "또 거짓말하는구나";
    // case 3:
    // return "정직하구나 너에게 모든 도끼를 주겠다";
    // default:
    // return "1 ~ 3 사이의 숫자를 입력해주세요.";
    // }
    // }

    // 강사님이 하신 퀴즈 코드 (switch문 심화)
    // case params type : byte, short, int, char, String, enum
    // lamda : ->
    // String result = null;
    // public String woodMan(int number) {
    // switch (number) {
    // case 1 -> result = "거짓말하는구나";
    // case 2 -> result = "또 거짓말하는구나";
    // case 3 -> result = "정직하구나 너에게 모든 도끼를 주겠다";
    // default -> result = "1 ~ 3 사이의 숫자를 입력해주세요.";
    // }
    // return result;
    // }

    public String woodMan(int number) {
        return switch (number) {
            case 1 -> "거짓말하는구나";
            case 2 -> "또 거짓말하는구나";
            case 3 -> "정직하구나 너에게 모든 도끼를 주겠다";
            default -> "1 ~ 3 사이의 숫자를 입력해주세요.";
        };
    }

    /*
    반복구문?(for ~, while, do ~ while)
    - [], Collection API(List, Set, Map), 
    - java ver 8~ Stream API(forEach ~ ) : lamda expression
    - 함수형 인터페이스(Supplier, Consumer, Function, Predicate)
    - 요소의 타입으로 기본 타입보다 참조타입을 활용하는 방법
    - continue, break : 반복도중 종료, 계속 진행하기 위한 키워드
    - for(초기식; 조건식; 증감식){

        }
    */

    // 하한값의 경계와 상한값의 경계를 포함하는 총합을 반환하고 싶다면?
    public int sumNumber(int start, int end){
        int result = 0;
        int temp = 0;

        if(start > end){
            temp = start;
            start = end;
            end = temp;
        } // 이렇게 하면 start와 end를 바꿀수 있음(start가 end보다 클때)

        for(int data = start; data <= end; data++){
            result += data; // result = result + data랑 같음
        }
        return result;
    }

    /*
    Q2번)
    ? static
    - 1 ~ 100 사이의 난수를 발생시킬예정(어떻게?)
    
    */
}
