public class CallByValueTest {
    public static void main(String[] args) {
        int n = 10;
        increase(n);

        System.out.println("n : " + n); // 10
    }

    static void increase(int m) {
        m = m + 1;
    }
}
