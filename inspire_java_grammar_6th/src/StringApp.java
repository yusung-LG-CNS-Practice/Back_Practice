public class StringApp {

    public static void main(String[] args) {

        // 1번 예시
        // String str01 = "lgcns";
        // String str02 = "lgcns";

        // 2번 예시
        String str01 = new String("lgcns");
        String str02 = new String("lgcns");

        // str01 == str02은 서로 주소값을 비교
        if (str01 == str02) {
            System.out.println("str01 == str02");
        } else {
            System.out.println("str01 != str02");
        }

        if (str01.equals(str02)) {
            System.out.println("str01.equals(str02)");
        } else {
            System.out.println("str01.!equals(str02)");
        }

        // str01 = str01 + "!!";
        StringBuffer sb = new StringBuffer(str01);
        sb = sb.append("!!");
        sb = sb.append("!!");
        sb = sb.append("!!");
        sb = sb.append("!!");
        String s = sb.toString();
    }
}
