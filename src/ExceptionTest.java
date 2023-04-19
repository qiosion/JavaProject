import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
        } catch (IllegalArgumentException e) {
            System.out.println("예외가 발생했습니다.");
            System.out.println(e);
        } finally {
            System.out.println("finally.. 생략가능");
        }
    }
}
