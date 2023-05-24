package loop_array03;

public class DoWhileSample {
    public static void main(String[] args) {
        char c = 'a';

        do {
            System.out.print(c);
            c = (char) (c + 1); // 소문자 a 다음의 값들로 넘어가기
        } while (c <= 'z');
    }
}
