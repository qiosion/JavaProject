package class04;

class StaticSampleClass {
    public int n;
    public void g() {
        m = 20;
    }
    public void h() {
        m = 30;
    }

    // static 멤버는 클래스 내 모든 객체들이 공유함!
    public static int m;
    public static void f() {
        m = 5;
    }
}

public class StaticSample {
    public static void main(String[] args) {
        StaticSampleClass s1, s2; // static 멤버의 생성

        s1 = new StaticSampleClass();
        s1.n = 5;
        System.out.println(s1.n); // 5
        System.out.println(s1.m); // 0 -> 변수 m 은 static


        s1.g(); // static 멤버에 접근
        System.out.println(s1.m); // 20

        s1.m = 50; // static 멤버에 접근
        System.out.println(s1.m); // 50

        System.out.println("==========================");

        s2 = new StaticSampleClass();
        s2.n = 8;
        System.out.println(s2.n); // 8
        System.out.println(s2.m); // 50 -> 변수 m 은 static

        s2.h();
        System.out.println(s2.m); // 30

        s2.f(); // f() 메서드는 static
        System.out.println(s2.m); // 5

        System.out.println("==========================");
        System.out.println(s1.m); // 5
    }
}
