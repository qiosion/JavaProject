public class ThisReference {
    int sum;
    int a;

    public void sum(int a, int b) { // a : 1, b : 2
        int sum;
        sum = a + b; // 3
        this.sum = sum;
        // this.sum 은 ThisReference 클래스의 객체 obj에 대한 것. 클래스 전체에서 정의된 전역변수
        // 그냥 sum 은 메서드 sum에서 정의된 지역변수. 파라미터
    }

    public void a(int a) {
        this.a = a;
        // a 는 지역변수. 메서드 a에서 정의된 지역변수, 파라미터
        // this.a 는 클래스 전체에서 정의된 전역변수.
    }

    public static void main(String[] args) {
        ThisReference obj = new ThisReference();
        obj.sum(1, 2);
        obj.a(10);
    }
}
