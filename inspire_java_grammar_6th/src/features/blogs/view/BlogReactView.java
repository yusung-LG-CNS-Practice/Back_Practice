package features.blogs.view;

import java.util.List;
import java.util.Scanner;

import features.blogs.domain.dto.BlogResponseDTO;
import features.blogs.facade.BlogFrontController;

// 8월 19일 실습 코드
public class BlogReactView {

    /*
     * Scanner 데이터 입력 처리
     * 예외처리
     * view has a FrontController
     */

    private Scanner scan;
    private BlogFrontController front;

    public BlogReactView() {
        scan = new Scanner(System.in);
        front = new BlogFrontController();
    }

    public void landingPage() {

        while (true) {
            System.out.println();
            System.out.println(">>>> Inspire Camp Blog Ver(1.0) <<<<");
            System.out.println("1. 전체검색");
            System.out.println("2. 게시글 상세보기");
            System.out.println("3. 입력화면");
            System.out.println("4. 수정화면");
            System.out.println("5. 게시글 삭제");
            System.out.println("6. 검색");
            System.out.println("99. 프로그램 종료");

            /*
             * Q1번 )
             * - 사용자로부터 문자열 정수가 아닌 문자열이 입력된다면 예외가 발생.
             * - 예외처리를 통해서 메시지를 출력하고 다시 입력받을 수 있도록 흐름을 제어
             */

            // 퀴즈에 대한 내 코드
            // try {
            // System.out.print("원하시는 메뉴 번호를 입력하세요 : ");
            // Integer number = Integer.parseInt(scan.nextLine());

            // switch (number) {
            // case 99:
            // exit();
            // break;

            // default:
            // break;
            // }
            // } catch (NumberFormatException e) {
            // // TODO: handle exception
            // System.out.println("숫자만 입력해주세요.");
            // }
            // 강사님 퀴즈 코드, try는 같음
            // catch (Exception e){
            // System.out.println("ERR) 메뉴에 있는 숫자만 가능합니다!! 다시 확인요망");
            // }

            // System.out.print("원하시는 메뉴 번호를 입력하세요 : ");
            // Integer number = Integer.parseInt(scan.nextLine());

            // switch (number) {
            // case 99:
            // exit();
            // break;

            // default:
            // break;
            // }

            // 퀴즈 이후 강의 실습 코드
            try {
                System.out.print("원하시는 메뉴 번호를 입력하세요 : ");
                Integer number = Integer.parseInt(scan.nextLine());

                switch (number) {
                    case 1:
                        list();
                        break;
                    case 99:
                        exit();
                        break;

                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("숫자만 입력해주세요.");
            }
        }
    }

    public void exit() {
        System.out.println();
        System.out.println(">>>> 시스템을 종료합니다.");
        System.exit(1);
    }

    public void list() {
        System.out.println();
        System.out.println(">>>> 데이터 출력");
        String endPoint = "list.inspire";
        List<BlogResponseDTO> response = front.list(endPoint);

        // stream api 출력 == json rendering (react)
        response.stream()
            // .forEach(person -> System.out.println(person));
            .forEach(System.out::println);
    }
}
