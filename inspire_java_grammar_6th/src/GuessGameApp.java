import java.util.Scanner;

import features.game.GuessGame;

public class GuessGameApp {

    public static void main(String[] args) {

        GuessGame game = new GuessGame();
        String forResult = game.gameFor();
        // String whileResult = game.gameWhile();
        // String dowhileResult = game.gameDoWhile();
        System.out.println(forResult);
        // System.out.println(whileResult);
        // System.out.println(dowhileResult);

        // 테스트 케이스
        // Scanner scan = new Scanner(System.in);
        // System.out.printf(">>>> 생각하는 숫자를 입력하세요");
        // int guess = scan.nextInt();
        // System.out.println("guess >>>> " + guess);
    }

}
