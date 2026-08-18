package features.generics;

// 8월 18일 실습 코드

public class ResponseTemplete<T> {

    private int code;
    private String message;
    private T data;

    public ResponseTemplete() {
    }

    public ResponseTemplete(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
