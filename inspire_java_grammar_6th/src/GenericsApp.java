import features.generics.ResponseTemplete;

public class GenericsApp {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("debug >>>> Generics App");

        ResponseTemplete<Integer> errCode = new ResponseTemplete<>();
        errCode.setCode(200);
        System.out.println("code : " + errCode.getCode());

        System.out.println();

        ResponseTemplete<String> errMessage = new ResponseTemplete<>();
        errMessage.setCode("리소스 생성완료");
        System.out.println("message : " + errMessage.getCode());
    }
}
