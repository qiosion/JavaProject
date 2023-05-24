package basic02;

public class Hello {
    public static void main(String[] args) {
        int i = 20;
        int j; // 정수
        char a; // 문자 하나
//        final int TEN = 10; // final : 상수. 값이 변하지 않으므로 대문자로 적는다

        j = sum(i, 10); // sum에서 Alt + Enter 누르면 활용가능한 것들 나옴
        a = '?';
        String b = "basic02.Hello"; // 문자열

        // 출력
        System.out.println(a);
        System.out.println(b);
        System.out.println(j);
    }
    private static int sum(int i, int j) {
        // private : 해당 클래스 내에서만 사용
        return i + j;
    }
}
