public class Gugudan {
    public static void main(String[] args) {
        // 중첩반복 -> 중첩된 for문을 사용하여 구구단 출력
        for (int i = 2; i <= 9; i++) {
            System.out.println(">>> " + i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i*j);
            }
            System.out.println();
        }
    }
}
