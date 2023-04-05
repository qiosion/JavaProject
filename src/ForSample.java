public class ForSample {
    public static void main(String[] args) {
        int sum = 0; // 전역변수 sum

        for (int i = 1; i <= 10; i++) { // 지역변수 i
            sum += i; // sum = sum + 1
            System.out.printf("%d", i);
            if (i <= 9) {
                System.out.printf(" + ");
            } else {
                System.out.printf(" = ");
                System.out.println(sum);
            }
        }
    }
}
