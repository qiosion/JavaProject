public class ConditionFor {
    // 조건식 - for문
    public static void main(String[] args) {
        // for문 예시
        for (int i = 0; i < 10; i++) {
            System.out.println(i); // 0~9 출력
        }

        // 처리 후 식과 작업문 자리를 바꾸면..
        for (int i = 0; i < 11; System.out.println(i-1)) {
            i++; // 0~10 출력
        // 처리후작업에 i로 하면 일단 시작시에 i++ 된 후에 for문돌아서 1~11 출력됨
        }

        // for문 예시 - 2단
        for (int i = 1; i <= 9; i++) {
//            System.out.println("2 * " + i + " = " + 2*i);
            System.out.printf("2 * %d = %d\n", i, 2*i);
        }

        // for문 예시 - 2단 - 처리후작업과 작업문 자리 바꿈
        for (int i = 1; i <= 9; System.out.printf("2 * %d = %d\n", i-1, 2*(i-1))) {
            i++;
        }

        // 처리 후 작업에 여러가지 식이 들어갈 수 있다
        for (int i = 0; i <= 9; i++, System.out.println("HELLO"), System.out.println("AAAA")) {
            System.out.printf("2 * %d = %d\n", i, 2*i);
        }

        // 무한루프 예시
        for (;;) {
            System.out.println("HELLO");
        }
    }
}
