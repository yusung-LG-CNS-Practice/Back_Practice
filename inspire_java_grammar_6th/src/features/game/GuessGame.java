package features.game;

import java.util.Scanner;

/*
Q5번) 숫자를 맞추는 게임

- 난수(1 ~ 100) : answer
- 주어진 기회는 10번 (up, down)
  콘솔로부터 데이터를 입력받기 위한(java.util.Scanner) scanner 메서드
- 반환값
- 성공) "x번째 정답을 맞췄습니다."
- 실패) "10번의 기회를 모두 사용하셨습니다."
*/
public class GuessGame {

    // 내가 푼 퀴즈 코드
    // public GuessGame() {

    // }

    // for 메소드
    // public String gameFor() {

    // Scanner scan = new Scanner(System.in);

    // int answer = (int) (Math.random() * 100) + 1;

    // // 디버깅용
    // // System.out.println("answer >>>> " + answer);

    // for (int cnt = 1; cnt <= 10; cnt++) {

    // System.out.print(cnt + "번째 숫자를 입력하세요 : ");
    // int guess = scan.nextInt();

    // if (guess == answer) {
    // return cnt + "번째 정답을 맞췄습니다.";
    // } else if (guess < answer) {
    // System.out.println("UP");
    // } else {
    // System.out.println("DOWN");
    // }
    // }

    // return "10번의 기회를 모두 사용하셨습니다.";
    // }

    // // while 메서드
    // public String gameWhile() {

    // Scanner scan = new Scanner(System.in);

    // int answer = (int) (Math.random() * 100) + 1;

    // // System.out.println("answer >>>> " + answer);

    // int cnt = 1;

    // while (cnt <= 10) {

    // System.out.print(cnt + "번째 숫자를 입력하세요 : ");
    // int guess = scan.nextInt();

    // if (guess == answer) {
    // return cnt + "번째 정답을 맞췄습니다.";
    // } else if (guess < answer) {
    // System.out.println("UP");
    // } else {
    // System.out.println("DOWN");
    // }

    // cnt++;
    // }

    // return "10번의 기회를 모두 사용하셨습니다.";
    // }

    // // do-while 메서드
    // public String gameDoWhile() {

    // Scanner scan = new Scanner(System.in);

    // int answer = (int) (Math.random() * 100) + 1;

    // // System.out.println("answer >>>> " + answer);

    // int cnt = 1;

    // do {

    // System.out.print(cnt + "번째 숫자를 입력하세요 : ");
    // int guess = scan.nextInt();

    // if (guess == answer) {
    // return cnt + "번째 정답을 맞췄습니다.";
    // } else if (guess < answer) {
    // System.out.println("UP");
    // } else {
    // System.out.println("DOWN");
    // }

    // cnt++;

    // } while (cnt <= 10);

    // return "10번의 기회를 모두 사용하셨습니다.";
    // }

    // 강사님이 푼 퀴즈 코드
    private int answer;

    public GuessGame() {
        answer = (int) (Math.random() * 100) + 1;
    }

    public String gameFor() {
        // 난수가 발생했는지 확인 로직 구현 후 주석처리
        System.out.println("debug >>>> answer log : " + answer);

        String forResult = null;
        int cnt = 0;
        boolean isFlag = false;

        Scanner scan = new Scanner(System.in);

        for (int idx = 1; idx <= 10; idx++) {
            cnt = idx;
            System.out.print(">>>> 생각하는 숫자를 입력하시오 : ");
            int guess = scan.nextInt();
            if (answer > guess) {
                System.out.println(">>> UP");
            } else if (answer < guess) {
                System.out.println(">>> DOWN");
            } else {
                isFlag = true;
                break;
            }
        }
        forResult = (isFlag) ? cnt + "번째 정답을 맞췄습니다" : "10번의 기회를 모두 사용하였습니다.";
        return forResult;
    }

    // public String gameWhile() {
    // return null;
    // }

    // public String gameDoWhile() {
    // return null;
    // }
}